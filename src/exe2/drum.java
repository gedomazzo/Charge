package exe2;

public class drum extends Playable {

    @Override
    public String play() {
        return super.play() + "this drums by hitting the toms";
    }

    public String change_them(){
        return "just dont buy drums";
    }

    public String make_noise(){
        return "make a noise";
    }
}
