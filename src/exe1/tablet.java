package exe1;

public class tablet extends Chargeable{

    @Override
    public String charge() {
        return super.charge() + " this tablet";
    }

    public String open(){
        return "open";
    }

    public String close(){
        return "close";
    }

}
