package org.assignment.iumtweb.iumtweb_springboot.Games;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.assignment.iumtweb.iumtweb_springboot.Player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.*;

@Service
public class GamesService {
    private final GamesRepository gamesRepository;
    private final  String CSV_FILE_PATH;

    @Autowired
    public GamesService(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
        this.CSV_FILE_PATH = "./IUM&Thttps/Eleonora_Francesco_Riccardo.gitWEB/Eleonora_Francesco_Riccardo/Assignment_Data_2023-2024/games.csv";
    }

    public Games saveGames(Games games) {
        return gamesRepository.save(games);
    }

    public void saveGames(List<Games> games) {
        this.gamesRepository.saveAll(games);
    }

    public void deleteGamesById(Long id) {
        gamesRepository.deleteById(id);
    }

    public Optional<Games> findGamesById(Long id) {
        return gamesRepository.findById(id);
    }

    public Optional<Games> findPGamesByHomeClubName(String homeClubName) {
        return gamesRepository.findByHomeClubName(homeClubName);
    }

    public Optional<Games> findByStadium(String stadium) {
        return gamesRepository.findByStadium(stadium);
    }

    public Optional<Games> findPlayerById(Long id) {
        return gamesRepository.findById(id);
    }

    public void loadGamesFromCsv() {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
            String[] nextLine;
            // Skip header if present
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                Games games = mapToGames(nextLine);
                saveGames(games);
            }{reader.close();}
        } catch (IOException | ParseException | CsvValidationException e) {
            e.printStackTrace();
        }
    }

    private Games mapToGames(String[] csvLive) throws ParseException, MalformedURLException {
        Games games = new Games();
        games.setGameId(Long.parseLong(csvLive[0]));
        games.setCompetitionId(csvLive[1]);
        games.setSeason(Integer.parseInt(csvLive[2]));
        games.setRound(csvLive[3]);
        games.setDate(new Date());
        games.setHomeClubId(Integer.parseInt(csvLive[5]));
        games.setAwayClubId(Integer.parseInt(csvLive[6]));

return games;

    }




}
