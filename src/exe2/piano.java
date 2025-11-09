package exe2;

public class piano extends Playable{
    @Override
    public String play() {
        return super.play() + " by pressing the keys";
    }

    public String learn_new_composiotion(){
        return "grab a book and open it, then read the notes";
    }

    public String tune(){
        return "order a tuner you are not doing it by yourself";
    }
}
