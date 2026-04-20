package com.artmarket.entities;

public class Artwork {
    private String title;
    private String artist;
    private String description;
    private String imageUrl;
    private double price;

    public Artwork(String title, String artist, String description, String imageUrl, double price) {
        this.title = title;
        this.artist = artist;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}