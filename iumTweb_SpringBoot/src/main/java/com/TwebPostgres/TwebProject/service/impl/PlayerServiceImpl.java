package com.TwebPostgres.TwebProject.service.impl;

import com.TwebPostgres.TwebProject.dto.PlayerDto;
import com.TwebPostgres.TwebProject.entity.Player;
import com.TwebPostgres.TwebProject.execption.ResourceNotFoundException;
import com.TwebPostgres.TwebProject.mapper.PlayerMapper;
import com.TwebPostgres.TwebProject.repository.PlayerRepository;
import com.TwebPostgres.TwebProject.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;
    @Override
    public PlayerDto createPlayer(PlayerDto playerDto) {

        Player player = PlayerMapper.mapToPlayer(playerDto);
        System.out.println(player);
        Player savePlayer = playerRepository.save(player);
        System.out.println(savePlayer);
        return PlayerMapper.mapToPlayerDto(savePlayer);
    }

    @Override
    public PlayerDto getPlayerById(Long playerId) {
       Player player =  playerRepository.findById(playerId)
                .orElseThrow(()->
                        new ResourceNotFoundException("Player not found with id: " + playerId));

        return PlayerMapper.mapToPlayerDto(player);
    }

    @Override
    public List<PlayerDto> getAllPlayers() {
       List<Player> players = playerRepository.findAll();
        return players.stream().map( (player) -> PlayerMapper.mapToPlayerDto(player)).collect(Collectors.toList());
    }

    @Override
    public PlayerDto updatePlayer(Long playerId, PlayerDto updatePlayer) {
        Player player = playerRepository.findById(playerId).orElseThrow(()->
                new ResourceNotFoundException("Player not found with id: " + playerId));
        player.setFirstName(updatePlayer.getFirstName());
        player.setLastName(updatePlayer.getLastName());
        player.setName(updatePlayer.getName());
        player.setLastSeason(updatePlayer.getLastSeason());
        player.setCurrentClubId(updatePlayer.getCurrentClubId());
        player.setPlayerCode(updatePlayer.getPlayerCode());
        player.setCountryOfBirth(updatePlayer.getCountryOfBirth());
        player.setCityOfBirth(updatePlayer.getCityOfBirth());
        player.setCountryOfCitizenship(updatePlayer.getCountryOfCitizenship());
        player.setDateOfBirth(updatePlayer.getDateOfBirth());
        player.setSubPosition(updatePlayer.getSubPosition());
        player.setPosition(updatePlayer.getPosition());
        player.setFoot(updatePlayer.getFoot());
        player.setHeightInCm(updatePlayer.getHeightInCm());
        player.setMarketValueInEur(updatePlayer.getMarketValueInEur());
        player.setHighestMarketValueInEur(updatePlayer.getHighestMarketValueInEur());
        player.setContractExpirationDate(updatePlayer.getContractExpirationDate());
        player.setAgentName(updatePlayer.getAgentName());
        player.setImageUrl(updatePlayer.getImageUrl());
        player.setUrl(updatePlayer.getUrl());
        player.setCurrentClubDomesticCompetitionId(updatePlayer.getCurrentClubDomesticCompetitionId());
        player.setCurrentClubName(updatePlayer.getCurrentClubName());
        player.setContractExpirationDate(updatePlayer.getContractExpirationDate());
        player.setMarketValueInEur(updatePlayer.getMarketValueInEur());
        player.setHeightInCm(updatePlayer.getHeightInCm());
        Player updatePlayerObj = playerRepository.save(player);
        return PlayerMapper.mapToPlayerDto(updatePlayerObj);

    }

    @Override
    public void deletePlayer(Long playerId) {
        Player player = playerRepository.findById(playerId).orElseThrow(()->
                new ResourceNotFoundException("Player not found with id: " + playerId));



        playerRepository.deleteById(playerId);
    }

}
