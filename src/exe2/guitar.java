package exe2;

public class guitar extends Playable {

    @Override
    public String play() {
        return super.play() + " this guitar by pulling the string";
    }

    public String sing(){
        return "grab a guitar and open your mouth and better to sing or youll look like an idiot";
    }

    public String repare(){
        return "bring it to the shop";
    }



}


