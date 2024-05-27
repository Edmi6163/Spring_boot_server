package com.TwebPostgres.TwebProject.mapper;

import com.TwebPostgres.TwebProject.dto.PlayerDto;
import com.TwebPostgres.TwebProject.entity.Player;

public class PlayerMapper {
    public static PlayerDto mapToPlayerDto(Player player) {
        return new PlayerDto(
                player.getPlayerId(),
                player.getFirstName(),
                player.getLastName(),
                player.getName(),
                player.getLastSeason(),
                player.getCurrentClubId(),
                player.getPlayerCode(),
                player.getCountryOfBirth(),
                player.getCityOfBirth(),
                player.getCountryOfCitizenship(),
                player.getDateOfBirth(),
                player.getSubPosition(),
                player.getPosition(),
                player.getFoot(),
                player.getHeightInCm(),
                player.getMarketValueInEur(),
                player.getHighestMarketValueInEur(),
                player.getContractExpirationDate(),
                player.getAgentName(),
                player.getImageUrl(),
                player.getUrl(),
                player.getCurrentClubDomesticCompetitionId(),
                player.getCurrentClubName(),
                player.getContractExpirationDate(),
                player.getMarketValueInEur(),
                player.getHeightInCm()
                );
    }

    public static Player mapToPlayer(PlayerDto playerDto) {
        return new Player(
                playerDto.getPlayerId(),
                playerDto.getFirstName(),
                playerDto.getLastName(),
                playerDto.getName(),
                playerDto.getLastSeason(),
                playerDto.getCurrentClubId(),
                playerDto.getPlayerCode(),
                playerDto.getCountryOfBirth(),
                playerDto.getCityOfBirth(),
                playerDto.getCountryOfCitizenship(),
                playerDto.getDateOfBirth(),
                playerDto.getSubPosition(),
                playerDto.getPosition(),
                playerDto.getFoot(),
                playerDto.getHeightInCm(),
                playerDto.getMarketValueInEur(),
                playerDto.getHighestMarketValueInEur(),
                playerDto.getContractExpirationDate(),
                playerDto.getAgentName(),
                playerDto.getImageUrl(),
                playerDto.getUrl(),
                playerDto.getCurrentClubDomesticCompetitionId(),
                playerDto.getCurrentClubName(),
                playerDto.getId(),
                playerDto.getId_key()
        );
    }

}
