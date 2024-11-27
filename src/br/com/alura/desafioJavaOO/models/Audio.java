package br.com.alura.desafioJavaOO.main.models;

public class Audio {
    private String title;
    private int totalPlaybacks;
    private int totalLikes;
    private int rating;

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlaybacks() {
        return totalPlaybacks;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }
    //

    public void Like() {
        this.totalLikes++;
    }

    public void playback() {
        this.totalPlaybacks++;
    }

}
