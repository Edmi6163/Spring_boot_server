package org.assignment.iumtweb.iumtweb_springboot.Competition;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.net.URL;

@Entity
@Table(name = "competition")
public class Competition {
    @Id
    @Column(name = "competition_id", nullable = false)
    private String id;
    private String competition_code;
    private String name;
    private String sub_type;
    private String type;
    private Integer country_id;
    private String country_name;
    private String domestic_league_code;
    private String confederation;
    private URL url;

    public Competition(String id, String competition_code, String name, String sub_type, String type, Integer country_id, String country_name, String domestic_league_code, String confederation, URL url) {
        this.id = id;
        this.competition_code = competition_code;
        this.name = name;
        this.sub_type = sub_type;
        this.type = type;
        this.country_id = country_id;
        this.country_name = country_name;
        this.domestic_league_code = domestic_league_code;
        this.confederation = confederation;
        this.url = url;
    }

    public Competition() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompetition_code() {
        return competition_code;
    }

    public void setCompetition_code(String competition_code) {
        this.competition_code = competition_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub_type() {
        return sub_type;
    }

    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getDomestic_league_code() {
        return domestic_league_code;
    }

    public void setDomestic_league_code(String domestic_league_code) {
        this.domestic_league_code = domestic_league_code;
    }

    public String getConfederation() {
        return confederation;
    }

    public void setConfederation(String confederation) {
        this.confederation = confederation;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }


}
