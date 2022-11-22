public class Change {

    int id;
    String country;
    long items_number;


    public Change(int id, String country, long items_number) {
        this.id = id;
        this.country = country;
        this.items_number = items_number;
    }

    @Override
    public String toString() {
        return "Change{" +
                "country='" + country + '\'' +
                ", copyrights='" + copyrights + '\'' +
                ", items_number=" + items_number +
                '}';
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
