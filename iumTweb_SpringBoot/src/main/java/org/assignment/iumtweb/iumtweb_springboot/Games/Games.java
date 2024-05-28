package org.assignment.iumtweb.iumtweb_springboot.Games;

import jakarta.persistence.*;

import java.net.URL;
import java.util.Date;

@Entity
@Table(name = "games")
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long game_id;
    private String competition_id;
    private int season;
    private String round;
    private Date date;
    private int home_club_id;
    private int away_club_id;
    private int home_club_goals;
    private int away_club_goals;
    private int home_goals;
    private int home_club_position;
    private int away_club_position;
    private String home_club_manager_name;
    private String away_club_manager_name;
    private String stadium;
    private int attendance;
    private String referee;
    private URL url;
    private String home_club_formation;
    private String away_club_formation;
    private String home_club_name;
    private String away_club_name;
    private String aggregate;
    private String competition_type;

    public Games(long game_id, String competition_id, int season, String round, Date date, int home_club_id, int away_club_id, int home_club_goals, int away_club_goals, int home_goals, int home_club_position, int away_club_position, String home_club_manager_name, String away_club_manager_name, String stadium, int attendance, String referee, URL url, String home_club_formation, String away_club_formation, String home_club_name, String away_club_name, String aggregate, String competition_type) {
        this.game_id = game_id;
        this.competition_id = competition_id;
        this.season = season;
        this.round = round;
        this.date = date;
        this.home_club_id = home_club_id;
        this.away_club_id = away_club_id;
        this.home_club_goals = home_club_goals;
        this.away_club_goals = away_club_goals;
        this.home_goals = home_goals;
        this.home_club_position = home_club_position;
        this.away_club_position = away_club_position;
        this.home_club_manager_name = home_club_manager_name;
        this.away_club_manager_name = away_club_manager_name;
        this.stadium = stadium;
        this.attendance = attendance;
        this.referee = referee;
        this.url = url;
        this.home_club_formation = home_club_formation;
        this.away_club_formation = away_club_formation;
        this.home_club_name = home_club_name;
        this.away_club_name = away_club_name;
        this.aggregate = aggregate;
        this.competition_type = competition_type;
    }

    public Games() {

    }


    public long getGame_id() {
        return game_id;
    }

    public void setGame_id(long game_id) {
        this.game_id = game_id;
    }

    public String getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(String competition_id) {
        this.competition_id = competition_id;
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

    public int getHome_club_id() {
        return home_club_id;
    }

    public void setHome_club_id(int home_club_id) {
        this.home_club_id = home_club_id;
    }

    public int getAway_club_id() {
        return away_club_id;
    }

    public void setAway_club_id(int away_club_id) {
        this.away_club_id = away_club_id;
    }

    public int getHome_club_goals() {
        return home_club_goals;
    }

    public void setHome_club_goals(int home_club_goals) {
        this.home_club_goals = home_club_goals;
    }

    public int getAway_club_goals() {
        return away_club_goals;
    }

    public void setAway_club_goals(int away_club_goals) {
        this.away_club_goals = away_club_goals;
    }

    public int getHome_goals() {
        return home_goals;
    }

    public void setHome_goals(int home_goals) {
        this.home_goals = home_goals;
    }

    public int getHome_club_position() {
        return home_club_position;
    }

    public void setHome_club_position(int home_club_position) {
        this.home_club_position = home_club_position;
    }

    public int getAway_club_position() {
        return away_club_position;
    }

    public void setAway_club_position(int away_club_position) {
        this.away_club_position = away_club_position;
    }

    public String getHome_club_manager_name() {
        return home_club_manager_name;
    }

    public void setHome_club_manager_name(String home_club_manager_name) {
        this.home_club_manager_name = home_club_manager_name;
    }

    public String getAway_club_manager_name() {
        return away_club_manager_name;
    }

    public void setAway_club_manager_name(String away_club_manager_name) {
        this.away_club_manager_name = away_club_manager_name;
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

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getHome_club_formation() {
        return home_club_formation;
    }

    public void setHome_club_formation(String home_club_formation) {
        this.home_club_formation = home_club_formation;
    }

    public String getAway_club_formation() {
        return away_club_formation;
    }

    public void setAway_club_formation(String away_club_formation) {
        this.away_club_formation = away_club_formation;
    }

    public String getHome_club_name() {
        return home_club_name;
    }

    public void setHome_club_name(String home_club_name) {
        this.home_club_name = home_club_name;
    }

    public String getAway_club_name() {
        return away_club_name;
    }

    public void setAway_club_name(String away_club_name) {
        this.away_club_name = away_club_name;
    }

    public String getAggregate() {
        return aggregate;
    }

    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }

    public String getCompetition_type() {
        return competition_type;
    }

    public void setCompetition_type(String competition_type) {
        this.competition_type = competition_type;
    }



}
