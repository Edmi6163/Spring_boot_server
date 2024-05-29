package org.assignment.iumtweb.iumtweb_springboot.Competition;

import org.assignment.iumtweb.iumtweb_springboot.Player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Competition")
public class CompetitionController {
    private final CompetitionService competitionService;

    @Autowired
    public CompetitionController(CompetitionService competitionService) {
        this.competitionService = competitionService;
    }

    @PostMapping("/insert")
    public ResponseEntity<String> insertCompetition() {
        competitionService.loadCompetitionsFromCsv();
        return ResponseEntity.ok("Competitions inserted successfully");
    }

    @PostMapping("/insertAll")
    public ResponseEntity<String> insertAllCompetitions() {
        competitionService.loadCompetitionsFromCsv();
        return ResponseEntity.ok("Competitions inserted successfully");
    }

    @PostMapping("/delete{id}")
    public ResponseEntity<String> deleteCompetition(@RequestParam Long id) {
        Optional<Competition> competition = competitionService.findCompetitionById(id);
        if(competition.isPresent()){
            competitionService.deleteCompetitionById(id);
            return new ResponseEntity<>("Competition deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/findByName")
    public ResponseEntity<Competition> findByName(@RequestParam String name) {
        Optional<Competition> competition = competitionService.findCompetitionByName(name);
        return competition.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/load")
    public String loadCompetition() {
        competitionService.loadCompetitionsFromCsv();
        return "Competitions inserted successfully";
    }






}
