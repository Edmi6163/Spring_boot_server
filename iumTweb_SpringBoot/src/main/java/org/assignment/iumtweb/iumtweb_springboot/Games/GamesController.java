package org.assignment.iumtweb.iumtweb_springboot.Games;

import org.assignment.iumtweb.iumtweb_springboot.Games.GamesController;
import org.assignment.iumtweb.iumtweb_springboot.Games.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return gamesService.findPGamesByHomeClubName(name).map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/findByStadium")
    public ResponseEntity<Games> findByStadium(@RequestParam String stadium) {
        return gamesService.findByStadium(stadium).map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/load")
    public String loadGames() {
        gamesService.loadGamesFromCsv();
        return "Games inserted successfully";
    }


}
