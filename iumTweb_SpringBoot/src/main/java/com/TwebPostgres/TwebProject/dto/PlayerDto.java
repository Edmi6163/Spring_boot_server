package com.TwebPostgres.TwebProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PlayerDto {
    private Integer playerId;

    private String firstName;

    private String lastName;

    private String name;

    private Integer lastSeason;

    private Integer currentClubId;

    private String playerCode;

    private String countryOfBirth;

    private String cityOfBirth;

    private String countryOfCitizenship;

    private LocalDate dateOfBirth;

    private String subPosition;

    private String position;

    private String foot;

    private Integer heightInCm;

    private Integer marketValueInEur;

    private Integer highestMarketValueInEur;

    private LocalDate contractExpirationDate;

    private String agentName;

    private String imageUrl;

    private String url;

    private String currentClubDomesticCompetitionId;

    private String currentClubName;

    private Double id;
    
    private Long id_key;

    public PlayerDto(Integer playerId, String firstName, String lastName, String name, Integer lastSeason, Integer currentClubId, String playerCode, String countryOfBirth, String cityOfBirth, String countryOfCitizenship, LocalDate dateOfBirth, String subPosition, String position, String foot, Integer heightInCm, Integer marketValueInEur, Integer highestMarketValueInEur, LocalDate contractExpirationDate, String agentName, String imageUrl, String url, String currentClubDomesticCompetitionId, String currentClubName, LocalDate contractExpirationDate1, Integer marketValueInEur1, Integer heightInCm1) {
    }
}
