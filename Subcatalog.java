public class Subcatalog {

    int id;
    Change change;
    String country;
    long items_number;

    public Subcatalog(int id, Change change, String country, long items_number) {
        this.id = id;
        this.change = change;
        this.country = country;
        this.items_number = items_number;
    }

    @Override
    public String toString() {
        return "Subcatalog{" +
                "change=" + change.country +
                ", country='" + country + '\'' +
                ", items_number=" + items_number +
                '}';
    }

    public Change getChange() {
        return change;
    }

    public void setChange(Change change) {
        this.change = change;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getItems_number() {
        return items_number;
    }

    public void setItems_number(long items_number) {
        this.items_number = items_number;
    }
}
