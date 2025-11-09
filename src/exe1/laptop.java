package exe1;

public class laptop extends Chargeable {

    @Override
    public String charge() {
        return super.charge() + " this laptop";
    }

    public String open(){
        return "opening the laptop";
    }

    public String close(){
        return "closed the laptop";
    }
}
