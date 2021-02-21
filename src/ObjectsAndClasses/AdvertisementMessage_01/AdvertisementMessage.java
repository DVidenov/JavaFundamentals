package ObjectsAndClasses.AdvertisementMessage_01;

public class AdvertisementMessage {
    String phrases;
    String events;
    String authors;
    String cities;

    public AdvertisementMessage(String phrases, String events, String authors, String cities) {
        this.phrases = phrases;
        this.events = events;
        this.authors = authors;
        this.cities = cities;
    }

    public void setPhrases(String phrases) {
        this.phrases = phrases;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getPhrases() {
        return phrases;
    }

    public String getEvents() {
        return events;
    }

    public String getAuthors() {
        return authors;
    }

    public String getCities() {
        return cities;
    }
}
