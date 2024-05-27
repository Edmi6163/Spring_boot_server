


package org.assignment.iumtweb.iumtweb_springboot.Player;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final String csvPath;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
        this.csvPath = "./IUM&TWEB/Eleonora_Francesco_Riccardo/Assignment_Data_2023-2024/players.csv";

    }

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    public void savePlayers(List<Player> players) {
        this.playerRepository.saveAll(players);
    }

    public void deletePlayerById(Long id) {
        playerRepository.deleteById(id);
    }

    public Optional<Player> findPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public Optional<Player> findPlayerByName(String name) {
        return playerRepository.findByName(name);
    }

    public void loadPlayersFromCsv() {
        try (CSVReader reader = new CSVReader(new FileReader(csvPath))) {
            String[] nextLine;
            // Skip header if present
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                Player player = mapToPlayer(nextLine);
                savePlayer(player);
            }{reader.close();}
        } catch (IOException | ParseException | CsvValidationException e) {
            e.printStackTrace();
        }
    }

    private Player mapToPlayer(String[] csvLine) throws ParseException, MalformedURLException {
        Player player = new Player();
        player.setFirstName(csvLine[1]);
        player.setLastName(csvLine[2]);
        player.setName(csvLine[3]);
        player.setLastSeason(Integer.parseInt(csvLine[4]));
        player.setCurrentClubId(Integer.parseInt(csvLine[5]));
        player.setPlayerCode(csvLine[6]);
        player.setCountryOfBirth(csvLine[7]);
        player.setCityOfBirth(csvLine[8]);
        try {
            player.setDateOfBirth(LocalDate.parse(csvLine[9]));
        } catch (DateTimeParseException e) {
            player.setDateOfBirth(null);
        }
        player.setSubPosition(csvLine[10]);
        player.setPosition(csvLine[11]);
        player.setFoot(csvLine[12]);
        player.setHeightInCm(parseIntOrNull(csvLine[13]));
        player.setMarketValueInEur(parseIntOrNull(csvLine[14]));
        player.setHighestMarketValueInEur(parseIntOrNull(csvLine[15]));
        try {
            player.setContractExpirationDate(LocalDate.parse(csvLine[16]));
        } catch (DateTimeParseException e) {
            player.setContractExpirationDate(null);
        }
        player.setAgentName(csvLine[17]);
        player.setImageUrl(csvLine[18]);
        player.setCurrentClubDomesticCompetitionId(csvLine[19]);
        player.setCurrentClubName(csvLine[20]);
        return player;
    }

    private Integer parseIntOrNull(String value) {
        if (value.isEmpty()) {
            return null;
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private Long parseLongOrNull(String value) {
        if (value.isEmpty()) {
            return null;
        }
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private Date parseDateOrNull(String value) throws ParseException {
        if (value.isEmpty()) {
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd").parse(value);
    }

    private URL parseUrlOrNull(String value) throws MalformedURLException {
        if (value.isEmpty()) {
            return null;
        }
        return new URL(value);
    }

}
