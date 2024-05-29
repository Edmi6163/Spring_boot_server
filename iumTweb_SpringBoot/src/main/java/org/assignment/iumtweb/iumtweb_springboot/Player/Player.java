package org.assignment.iumtweb.iumtweb_springboot.Player;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id", nullable = false)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLastSeason() {
        return lastSeason;
    }

    public void setLastSeason(Integer lastSeason) {
        this.lastSeason = lastSeason;
    }

    public Integer getCurrentClubId() {
        return currentClubId;
    }

    public void setCurrentClubId(Integer currentClubId) {
        this.currentClubId = currentClubId;
    }

    public String getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(String playerCode) {
        this.playerCode = playerCode;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public String getCountryOfCitizenship() {
        return countryOfCitizenship;
    }

    public Player(String firstName, String lastName, String name, Integer lastSeason, Integer currentClubId, String playerCode, String countryOfBirth, String cityOfBirth, String countryOfCitizenship, LocalDate dateOfBirth, String subPosition, String position, String foot, Integer heightInCm, Integer marketValueInEur, Integer highestMarketValueInEur, LocalDate contractExpirationDate, String agentName, String imageUrl, String url, String currentClubDomesticCompetitionId, String currentClubName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = name;
        this.lastSeason = lastSeason;
        this.currentClubId = currentClubId;
        this.playerCode = playerCode;
        this.countryOfBirth = countryOfBirth;
        this.cityOfBirth = cityOfBirth;
        this.countryOfCitizenship = countryOfCitizenship;
        this.dateOfBirth = dateOfBirth;
        this.subPosition = subPosition;
        this.position = position;
        this.foot = foot;
        this.heightInCm = heightInCm;
        this.marketValueInEur = marketValueInEur;
        this.highestMarketValueInEur = highestMarketValueInEur;
        this.contractExpirationDate = contractExpirationDate;
        this.agentName = agentName;
        this.imageUrl = imageUrl;
        this.url = url;
        this.currentClubDomesticCompetitionId = currentClubDomesticCompetitionId;
        this.currentClubName = currentClubName;
    }

    public void setCountryOfCitizenship(String countryOfCitizenship) {
        this.countryOfCitizenship = countryOfCitizenship;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSubPosition() {
        return subPosition;
    }

    public void setSubPosition(String subPosition) {
        this.subPosition = subPosition;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public Integer getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(Integer heightInCm) {
        this.heightInCm = heightInCm;
    }

    public Integer getMarketValueInEur() {
        return marketValueInEur;
    }

    public void setMarketValueInEur(Integer marketValueInEur) {
        this.marketValueInEur = marketValueInEur;
    }

    public Integer getHighestMarketValueInEur() {
        return highestMarketValueInEur;
    }

    public void setHighestMarketValueInEur(Integer highestMarketValueInEur) {
        this.highestMarketValueInEur = highestMarketValueInEur;
    }

    public LocalDate getContractExpirationDate() {
        return contractExpirationDate;
    }

    public void setContractExpirationDate(LocalDate contractExpirationDate) {
        this.contractExpirationDate = contractExpirationDate;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCurrentClubDomesticCompetitionId() {
        return currentClubDomesticCompetitionId;
    }

    public void setCurrentClubDomesticCompetitionId(String currentClubDomesticCompetitionId) {
        this.currentClubDomesticCompetitionId = currentClubDomesticCompetitionId;
    }

    public String getCurrentClubName() {
        return currentClubName;
    }

    public void setCurrentClubName(String currentClubName) {
        this.currentClubName = currentClubName;
    }

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "name")
    private String name;

    @Column(name = "last_season")
    private Integer lastSeason;

    @Column(name = "current_club_id")
    private Integer currentClubId;

    @Column(name = "player_code")
    private String playerCode;

    @Column(name = "country_of_birth")
    private String countryOfBirth;

    @Column(name = "city_of_birth")
    private String cityOfBirth;

    @Column(name = "country_of_citizenship")
    private String countryOfCitizenship;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "sub_position")
    private String subPosition;

    @Column(name = "\"position\"")
    private String position;

    @Column(name = "foot")
    private String foot;

    @Column(name = "height_in_cm")
    private Integer heightInCm;

    @Column(name = "market_value_in_eur")
    private Integer marketValueInEur;

    @Column(name = "highest_market_value_in_eur")
    private Integer highestMarketValueInEur;

    @Column(name = "contract_expiration_date")
    private LocalDate contractExpirationDate;

    @Column(name = "agent_name")
    private String agentName;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "url")
    private String url;

    @Column(name = "current_club_domestic_competition_id")
    private String currentClubDomesticCompetitionId;

    @Column(name = "current_club_name")
    private String currentClubName;

    public Player() {
    }

}
