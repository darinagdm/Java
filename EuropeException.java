class EuropeException extends ArithmeticException{
    private String message;

    EuropeException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}

class EuropeException extends ArithmeticException {
    private final int change_id;

    ChangeException(int change_id){
        this.change_id = change_id;
    }

    @Override
    public String toString() {
        return String.format("No change with such id: %d", this.change_id);
    }
}

class SubchangeException extends ArithmeticException {
    private final int subchange_id;

    SubchangeException(int subchange_id){
        this.subchange_id = subchange_id;
    }

    @Override
    public String toString() {
        return String.format("No subchange with such id: %d", this.subchange_id);
    }
}

class RecordException extends ArithmeticException {
    private int record_id;

    RecordException(int record_id){
        this.record_id = record_id;
    }

    @Override
    public String toString() {
        return String.format("No record with such id: %d", this.record_id);
    }
}
