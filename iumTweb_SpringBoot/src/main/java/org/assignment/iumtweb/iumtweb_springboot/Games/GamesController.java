package org.assignment.iumtweb.iumtweb_springboot.Games;

import org.assignment.iumtweb.iumtweb_springboot.Games.GamesController;
import org.assignment.iumtweb.iumtweb_springboot.Games.GamesService;
import org.assignment.iumtweb.iumtweb_springboot.Player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Games")
public class GamesController {
    private final GamesService gamesService;

    @Autowired
    public GamesController(GamesService gamesService) {
        this.gamesService = gamesService;
    }

    @PostMapping("/insert")
    public ResponseEntity<Games> insertGames(@RequestBody Games games) {
        Games savedGames = gamesService.saveGames(games);
        return new ResponseEntity<>(savedGames, HttpStatus.CREATED);
    }

    @PostMapping("/insertAll")
    public ResponseEntity<String> insertAllGames() {
        gamesService.loadGamesFromCsv();
        return new ResponseEntity<>("Games inserted successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteGames(@PathVariable Long id) {
        gamesService.deleteGamesById(id);
        return new ResponseEntity<>("Games deleted successfully", HttpStatus.OK);
    }

    @PostMapping("/findByHomeClubName")
    public ResponseEntity<Games> findByHomeClubName(@RequestParam String name) {
        Optional<Games> games = gamesService.findPGamesByHomeClubName(name);
        return games.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/findByStadium")
    public ResponseEntity<Games> findByStadium(@RequestParam String stadium) {
        Optional<Games> games = gamesService.findByStadium(stadium);
        return games.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/findByGameId")
    public ResponseEntity<Games> findByGameId(@RequestParam Long gameId) {
        Optional<Games> games = gamesService.findByGameId(gameId);
        return games.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/findByHomeClubManagerName")
    public ResponseEntity<Games> findByHomeClubManagerName(@RequestParam String homeClubManagerName) {
        return gamesService.findByHomeClubManagerName(homeClubManagerName).map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/load")
    public String loadGames() {
        gamesService.loadGamesFromCsv();
        return "Games inserted successfully";
    }


}
