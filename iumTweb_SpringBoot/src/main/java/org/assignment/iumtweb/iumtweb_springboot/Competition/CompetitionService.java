package org.assignment.iumtweb.iumtweb_springboot.Competition;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.*;

public class CompetitionService {
    private final CompetitionRepository competitionRepository;
    private final String CSV_FILE_PATH;

    public CompetitionService(CompetitionRepository competitionRepository,String CSV_FILE_PATH){
        this.competitionRepository = competitionRepository;
        this.CSV_FILE_PATH = "./IUM&TWEB/Eleonora_Francesco_Riccardo/Assignment_Data_2023-2024/competitions.csv";
    }



    public Competition saveCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }
    public void saveCompetitions(List<Competition> competitions) {
        this.competitionRepository.saveAll(competitions);
    }
    public void deleteCompetitionById(Long id) {
        competitionRepository.deleteById(id);
    }
    public Optional<Competition> findCompetitionById(Long id) {
        return competitionRepository.findById(id);
    }
    public Optional<Competition> findCompetitionByName(String name) {
        return competitionRepository.findByName(name);
    }
    public void loadCompetitionsFromCsv() {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
            String[] nextLine;
            // Skip header if present
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                Competition competition = new Competition();
                competition.setId(nextLine[0]);
                competition.setCompetition_code(nextLine[1]);
                competition.setName(nextLine[2]);
                competition.setSub_type(nextLine[3]);
                competition.setType(nextLine[4]);
                competition.setCountry_id(Integer.parseInt(nextLine[5]));
                competition.setCountry_name(nextLine[6]);
                competition.setDomestic_league_code(nextLine[7]);
                competition.setConfederation(nextLine[8]);
                competition.setUrl(new URL(nextLine[9]));
                competitionRepository.save(competition);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
    public Competition mapToCompetition(String[] csvLine) throws ParseException, MalformedURLException{
        Competition competition = new Competition();
        competition.setId(csvLine[0]);
        competition.setCompetition_code(csvLine[1]);
        competition.setName(csvLine[2]);
        competition.setSub_type(csvLine[3]);
        competition.setType(csvLine[4]);
        competition.setCountry_id(Integer.parseInt(csvLine[5]));
        competition.setCountry_name(csvLine[6]);
        competition.setDomestic_league_code(csvLine[7]);
        competition.setConfederation(csvLine[8]);
        competition.setUrl(new URL(csvLine[9]));
        return competition;
    }

}
