package week5;

public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishing_year;
    private double weight = 0.1;

    public CD(String artist, String title, int publishing_year){
        this.artist = artist;
        this.title = title;
        this.publishing_year = publishing_year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishing_year() {
        return publishing_year;
    }

    public void setPublishing_year(int publishing_year) {
        this.publishing_year = publishing_year;
    }
    @Override
    public double weight(){
        return 0.1;
    }
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishing_year + ")";
    }
}
