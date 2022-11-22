public class Record {
    int id;
    Change change;
    Subchange subch;
    String countries;
    String title;

    public Record(int id, Change change, Subchange subch, String countries, String title) {
        this.id = id;
        this.change = change;
        this.subch = subch;
        this.countries = countries;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Record{" +
                "change=" + change.countries +
                ", subch=" + subch.countries +
                ", title='" + title + '\'' +
                '}';
    }

    public Change getChange() {
        return catalog;
    }

    public void setChange(Change change) {
        this.change = change;
    }

    public Subchange getSubch() {
        return subch;
    }

    public void setSubch(Subchange subch) {
        this.subch = subch;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
