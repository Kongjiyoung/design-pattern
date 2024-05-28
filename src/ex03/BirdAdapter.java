package ex03;

import ex03.lib.OuterBird;
import ex03.lib.OuterRabbit;

public class BirdAdapter extends Animal{
    private OuterBird outerBied;

    public BirdAdapter(OuterBird outerBied){
        this.outerBied = outerBied;
    }

    @Override
    public String getName() {
        return outerBied.getFullname();
    }
}
