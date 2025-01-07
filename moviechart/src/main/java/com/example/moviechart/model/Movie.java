package com.example.moviechart.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String poster;
    private String title;
    private String date;
    private String actor;
    private String director;

    public Movie() {}
    // public Movie(Long id, String imageUrl, String title, String releaseDate, String actor, String director) {
    public Movie(Long id, String imageUrl, String title, String releaseDate, String actor, String director) {        
        // this.id = id;
        this.poster = imageUrl;
        this.title = title;
        this.date = releaseDate;
        this.actor = actor;
        this.director = director;
    }
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPoster() { return poster; }
    public void setPoster(String poster) { this.poster = poster; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getActor() { return actor; }
    public void setActor(String actor) { this.actor = actor; }
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
}
