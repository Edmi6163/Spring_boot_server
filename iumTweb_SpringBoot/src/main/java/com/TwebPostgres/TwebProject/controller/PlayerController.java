package com.TwebPostgres.TwebProject.controller;

import com.TwebPostgres.TwebProject.dto.PlayerDto;
import com.TwebPostgres.TwebProject.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private PlayerService playerService;

    @PostMapping
    public ResponseEntity<PlayerDto>createPlayer( @RequestBody PlayerDto playerDto)
    {
        System.out.println(playerDto);
        PlayerDto savedPlayer = playerService.createPlayer(playerDto);
        return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);

    }
    @GetMapping("{playerId}")
    public ResponseEntity<PlayerDto> getPlayerById(@PathVariable("playerId") Long playerId)
    {
        PlayerDto playerDto = playerService.getPlayerById(playerId);
        return ResponseEntity.ok(playerDto);
    }
    @GetMapping
    public ResponseEntity<List<PlayerDto>>getAllPlayer()
    {
        List<PlayerDto> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }
    @PutMapping("{playerId}")
    public ResponseEntity<PlayerDto>updatePlayer(@PathVariable("playerId") Long playerId, @RequestBody PlayerDto playerDto)
    {
        PlayerDto updatedPlayer = playerService.updatePlayer(playerId, playerDto);
        return ResponseEntity.ok(updatedPlayer);
    }
    @DeleteMapping("{playerId}")
    public ResponseEntity<String>deletePlayer(@PathVariable("playerId") Long playerId)
    {
        playerService.deletePlayer(playerId);
        return ResponseEntity.ok("Player deleted successfully");
    }
}
