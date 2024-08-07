package edu.kathford.listviewexample.model;

public class Movie {

    private String title;
    private String releaseDate;
    private String imageUrl;

    public Movie(String title, String releaseDate, String imageUrl) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
