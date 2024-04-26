package org.assignment.iumtweb.iumtweb_springboot.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Player")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/insert")
    public ResponseEntity<Player> insertPlayer(@RequestBody Player player) {
        Player savedPlayer = playerService.savePlayer(player);
        return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
    }

    @PostMapping("/insertAll")
    public ResponseEntity<String> insertAllPlayers() {
        playerService.loadPlayersFromCsv(playerService.csvPath);
        return new ResponseEntity<>("Players inserted successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable Long id) {
        Optional<Player> player = playerService.findPlayerById(id);
        if (player.isPresent()) {
            playerService.deletePlayerById(id);
            return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/findByName")
    public ResponseEntity<Player> findByName(@RequestParam String name) {
        Optional<Player> player = playerService.findPlayerByName(name);
        return player.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}