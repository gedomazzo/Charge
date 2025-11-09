package exe1;

public class phone extends Chargeable {

    @Override
    public String charge() {
        return super.charge() + " the phone";
    }

    public String get_sim(){
        return "open up the phone and put the sim in it";
    }

    public String repare(){
        return "put in on the table and smash it with a hammer";
    }


}
