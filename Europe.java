import java.util.ArrayList;
import java.util.List;

public class Europe {

    private static class Storage{
        List<Change> changes = new ArrayList<>();
        List<Subchange> subch = new ArrayList<>();
        List<Record> records = new ArrayList<>();

        Change getChange(int change_id){
            boolean found = false;
            for(Change change: this.changes){
                if(change.id == change){
                    return change;
                }
            }

            if (!found) {
                throw new ChangeException(change_id);
            }

            return null;
        }
        
        Subchange getSubchange(int subchange_id){
            boolean found = false;

            for(Subchange subchange: this.subch){
                if(subchange.id == subchange_id){
                    return subcatalog;
                }
            }

            if (!found) {
                throw new SubchangeException(subchange_id);
            }

            return null;
        }

        Record getRecord(int record_id){
            boolean found = false;

            for(Record record: this.records){
                if(record.id == record_id){
                    return record;
                }
            }
            if (!found) {
                throw new RecordException(record_id);
            }

            return null;
        }


        void addChange(Change change){
            this.changes.add(change);
        }
        
        void addSubchange(Subchange subchange){
            this.subch.add(subchange);
        }

        void addRecord(Record record){
            this.records.add(record);
        }

    }

    String title;
    String encoding;
    int year;
    Storage storage;

    public Europe(String title, String encoding, int year) {
        this.title = title;
        this.encoding = encoding;
        this.year = year;
        this.storage = new Europe.Storage();
    }

    public static void main(String args[]){
        Change change1 = new Change(1, "Europe", "Ukraine", 100000);
        Subchange subchange1 = new Subchange(1, change1, "Eastern Europe", "Ukraine", 12445);
        Record record1 = new Record(1, change1, subchange1, "Ukraine", "Ukraine", "The west of Ukraine","Lviv", 248.0);

        Europe ch = new Europe("Lviv", "H.262/MPEG-2 Part 2", 1957);
        ch.storage.addChange(change1);
        ch.storage.addSubchange(subchange1);
        ch.storage.addRecord(record1);

        System.out.println("\nRecord you are looking for: ");
        Record new_record = ch.storage.getRecord(1);
        System.out.println(new_record);

        System.out.println("\nEverything seems okay, but... \n");

        Record new_record2 = ch.storage.getRecord(2);
        System.out.println(new_record2);
    
    }

}
