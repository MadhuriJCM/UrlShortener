package com.example.urlshortener;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShortUrl {

    @Id
    private String shortId;
    private String originalUrl;

    // Constructors
    public ShortUrl() {
    }

    public ShortUrl(String shortId, String originalUrl) {
        this.shortId = shortId;
        this.originalUrl = originalUrl;
    }

    // Getters and Setters
    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }
}
