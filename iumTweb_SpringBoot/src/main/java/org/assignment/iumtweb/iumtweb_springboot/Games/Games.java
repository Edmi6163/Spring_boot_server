package org.assignment.iumtweb.iumtweb_springboot.Games;

import jakarta.persistence.*;
import java.net.URL;
import java.util.Date;

@Entity
@Table(name = "games")
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;
    private String competitionId;
    private Integer season;
    private String round;
    private Date date;
    private Integer homeClubId;
    private Integer awayClubId;
    private Integer homeClubGoals;
    private Integer awayClubGoals;
    private Integer homeClubPosition;
    private Integer awayClubPosition;
    private String homeClubManagerName;
    private String awayClubManagerName;
    private String stadium;
    private Integer attendance;
    private String referee;
    private String url;
    private String homeClubFormation;
    private String awayClubFormation;
    private String homeClubName;
    private String awayClubName;
    private String aggregate;
    private String competitionType;

    public Games(Long gameId, String competitionId, Integer season, String round, Date date, Integer homeClubId, Integer awayClubId, Integer homeClubGoals, Integer awayClubGoals, Integer homeClubPosition, Integer awayClubPosition, String homeClubManagerName, String awayClubManagerName, String stadium, Integer attendance, String referee, String url, String homeClubFormation, String awayClubFormation, String homeClubName, String awayClubName, String aggregate, String competitionType) {
        this.gameId = gameId;
        this.competitionId = competitionId;
        this.season = season;
        this.round = round;
        this.date = date;
        this.homeClubId = homeClubId;
        this.awayClubId = awayClubId;
        this.homeClubGoals = homeClubGoals;
        this.awayClubGoals = awayClubGoals;
        this.homeClubPosition = homeClubPosition;
        this.awayClubPosition = awayClubPosition;
        this.homeClubManagerName = homeClubManagerName;
        this.awayClubManagerName = awayClubManagerName;
        this.stadium = stadium;
        this.attendance = attendance;
        this.referee = referee;
        this.url = url;
        this.homeClubFormation = homeClubFormation;
        this.awayClubFormation = awayClubFormation;
        this.homeClubName = homeClubName;
        this.awayClubName = awayClubName;
        this.aggregate = aggregate;
        this.competitionType = competitionType;
    }

    public Games() {
    }

    // Getters and setters

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public String getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHomeClubId() {
        return homeClubId;
    }

    public void setHomeClubId(int homeClubId) {
        this.homeClubId = homeClubId;
    }

    public int getAwayClubId() {
        return awayClubId;
    }

    public void setAwayClubId(int awayClubId) {
        this.awayClubId = awayClubId;
    }

    public int getHomeClubGoals() {
        return homeClubGoals;
    }

    public void setHomeClubGoals(int homeClubGoals) {
        this.homeClubGoals = homeClubGoals;
    }

    public int getAwayClubGoals() {
        return awayClubGoals;
    }

    public void setAwayClubGoals(int awayClubGoals) {
        this.awayClubGoals = awayClubGoals;
    }

    public int getHomeClubPosition() {
        return homeClubPosition;
    }

    public void setHomeClubPosition(int homeClubPosition) {
        this.homeClubPosition = homeClubPosition;
    }

    public int getAwayClubPosition() {
        return awayClubPosition;
    }

    public void setAwayClubPosition(int awayClubPosition) {
        this.awayClubPosition = awayClubPosition;
    }

    public String getHomeClubManagerName() {
        return homeClubManagerName;
    }

    public void setHomeClubManagerName(String homeClubManagerName) {
        this.homeClubManagerName = homeClubManagerName;
    }

    public String getAwayClubManagerName() {
        return awayClubManagerName;
    }

    public void setAwayClubManagerName(String awayClubManagerName) {
        this.awayClubManagerName = awayClubManagerName;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHomeClubFormation() {
        return homeClubFormation;
    }

    public void setHomeClubFormation(String homeClubFormation) {
        this.homeClubFormation = homeClubFormation;
    }

    public String getAwayClubFormation() {
        return awayClubFormation;
    }

    public void setAwayClubFormation(String awayClubFormation) {
        this.awayClubFormation = awayClubFormation;
    }

    public String getHomeClubName() {
        return homeClubName;
    }

    public void setHomeClubName(String homeClubName) {
        this.homeClubName = homeClubName;
    }

    public String getAwayClubName() {
        return awayClubName;
    }

    public void setAwayClubName(String awayClubName) {
        this.awayClubName = awayClubName;
    }

    public String getAggregate() {
        return aggregate;
    }

    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }

    public String getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(String competitionType) {
        this.competitionType = competitionType;
    }
}

