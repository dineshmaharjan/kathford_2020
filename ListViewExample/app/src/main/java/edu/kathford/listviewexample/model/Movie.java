package edu.kathford.listviewexample.model;

public class Movie {

    private String title;
    private String releaseDate;
    private String imageUrl;


    private void setTitle(String title){
        this.title = title;
    }

    private String getTitle(){
        return this.title;
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
