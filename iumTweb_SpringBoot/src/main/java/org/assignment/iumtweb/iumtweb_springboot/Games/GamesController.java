package org.assignment.iumtweb.iumtweb_springboot.Games;

import org.assignment.iumtweb.iumtweb_springboot.Games.GamesController;
import org.assignment.iumtweb.iumtweb_springboot.Games.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Games")
public class GamesController {
    private final GamesService gamesService;
    /*
    @Autowired
    public GamesController(GamesService gamesService) {
        this.gamesService = gamesService;
    }

     */


}
