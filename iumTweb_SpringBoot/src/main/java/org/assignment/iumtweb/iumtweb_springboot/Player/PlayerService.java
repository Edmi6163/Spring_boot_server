


package org.assignment.iumtweb.iumtweb_springboot.Player;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        this.csvPath ="/Users/popper/Documents/Uni/Terzo_anno /TWEB/Progettto/Assignment Data 2023-2024/players.csv";

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
        player.setFirstname(csvLine[1]);
        player.setLastname(csvLine[2]);
        player.setName(csvLine[3]);
        player.setLast_season(Integer.parseInt(csvLine[4]));
        player.setCurrent_club(Integer.parseInt(csvLine[5]));
        player.setPlayer_code(csvLine[6]);
        player.setCountry_of_birth(csvLine[7]);
        player.setCity_of_birth(csvLine[8]);
        player.setDate_of_birth(csvLine[9]);
        player.setSub_position(csvLine[10]);
        player.setPosition(csvLine[11]);
        player.setFoot(csvLine[12]);
        player.setHeight_in_cm(parseLongOrNull(csvLine[13]));
        player.setMarket_value_in_eur(parseIntOrNull(csvLine[14]));
        player.setHighest_market_value_in_eur(parseIntOrNull(csvLine[15]));
        player.setContract_expiration_date(csvLine[16]);
        player.setAgent_name(csvLine[17]);
        player.setImage_url(parseUrlOrNull(csvLine[18]));
        player.setCurrent_club_domestic_competition_id(csvLine[19]);
        player.setCurrent_club_name(csvLine[20]);
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
