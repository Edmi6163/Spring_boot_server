package org.assignment.iumtweb.iumtweb_springboot.Player;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.net.URL;
import java.util.Date;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "name")
    private String name;

    @Column(name = "last_season")
    private int last_season;

    @Column(name = "current_club")
    private int current_club;

    @Column(name = "player_code")
    private String player_code;

    @Column(name = "country_of_birth")
    private String country_of_birth;

    @Column(name = "city_of_birth")
    private String city_of_birth;
    @Column(name = "date_of_birth")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date_of_birth;

    @Column(name = "sub_position")
    private String sub_position;

    @Column(name = "position")
    private String position;

    @Column(name = "foot")
    private String foot;

    @Column(name = "height_in_cm")
    private Long height_in_cm;

    @Column(name = "contract_expiration_date")
    //@JsonFormat(pattern = "yyyy-MM-dd")

    private String contract_expiration_date;

    @Column(name = "market_value_in_eur")
    private Integer market_value_in_eur;

    @Column(name = "highest_market_value_in_eur")
    private Integer highest_market_value_in_eur;

    @Column(name = "agent_name")
    private String agent_name;

    @Column(name = "image_url")
    private URL image_url;

    @Column(name = "current_club_domestic_competition_id")
    private String current_club_domestic_competition_id;

    @Column(name = "current_club_name")
    private String current_club_name;

    // Costruttore vuoto
    public Player() {}

/* io no ho resettato nullah hahah
 */
/* sono afk perchè è uscita una problematica , per questo mi hai resettato i nomi delle colonne? */

    public Player(Long id, String firstname, String lastname, String name, int last_season, int current_club, String player_code, String country_of_birth, String city_of_birth, String date_of_birth, String sub_position, String position, String foot, Long height_in_cm, Integer market_value_in_eur, Integer highest_market_value_in_eur, String contract_expiration_date, String agent_name, URL image_url, String current_club_domestic_competition_id, String current_club_name) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.name = name;
        this.last_season = last_season;
        this.current_club = current_club;
        this.player_code = player_code;
        this.country_of_birth = country_of_birth;
        this.city_of_birth = city_of_birth;
        this.date_of_birth = date_of_birth;
        this.sub_position = sub_position;
        this.position = position;
        this.foot = foot;
        this.height_in_cm = height_in_cm;
        this.market_value_in_eur = market_value_in_eur;
        this.highest_market_value_in_eur = highest_market_value_in_eur;
        this.contract_expiration_date = contract_expiration_date;
        this.agent_name = agent_name;
        this.image_url = image_url;
        this.current_club_domestic_competition_id = current_club_domestic_competition_id;
        this.current_club_name = current_club_name;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLast_season() {
        return last_season;
    }

    public void setLast_season(int last_season) {
        this.last_season = last_season;
    }

    public int getCurrent_club() {
        return current_club;
    }

    public void setCurrent_club(int current_club) {
        this.current_club = current_club;
    }

    public String getPlayer_code() {
        return player_code;
    }

    public void setPlayer_code(String player_code) {
        this.player_code = player_code;
    }

    public String getCountry_of_birth() {
        return country_of_birth;
    }

    public void setCountry_of_birth(String country_of_birth) {
        this.country_of_birth = country_of_birth;
    }

    public String getCity_of_birth() {
        return city_of_birth;
    }

    public void setCity_of_birth(String city_of_birth) {
        this.city_of_birth = city_of_birth;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getSub_position() {
        return sub_position;
    }

    public void setSub_position(String sub_position) {
        this.sub_position = sub_position;
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

    public long getHeight_in_cm() {
        return height_in_cm;
    }

    public void setHeight_in_cm(Long height_in_cm) {
        this.height_in_cm = height_in_cm;
    }

    public long getMarket_value_in_eur() {
        return market_value_in_eur;
    }

    public void setMarket_value_in_eur(Integer market_value_in_eur) {
        this.market_value_in_eur = market_value_in_eur;
    }

    public long getHighest_market_value_in_eur() {
        return highest_market_value_in_eur;
    }

    public void setHighest_market_value_in_eur(Integer highest_market_value_in_eur) {
        this.highest_market_value_in_eur = highest_market_value_in_eur;
    }

    public String getContract_expiration_date() {
        return contract_expiration_date;
    }

    public void setContract_expiration_date(String contract_expiration_date) {
        this.contract_expiration_date = contract_expiration_date;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public URL getImage_url() {
        return image_url;
    }

    public void setImage_url(URL image_url) {
        this.image_url = image_url;
    }

    public String getCurrent_club_domestic_competition_id() {
        return current_club_domestic_competition_id;
    }

    public void setCurrent_club_domestic_competition_id(String current_club_domestic_competition_id) {
        this.current_club_domestic_competition_id = current_club_domestic_competition_id;
    }

    public String getCurrent_club_name() {
        return current_club_name;
    }

    public void setCurrent_club_name(String current_club_name) {
        this.current_club_name = current_club_name;
    }


}