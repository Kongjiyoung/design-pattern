package ex03;

import ex03.lib.OuterBird;
import ex03.lib.OuterRabbit;

public class App {
    public static void main(String[] args) {
        Animal rabbit = new RabbitAdapter(new OuterRabbit());
        Animal bird = new BirdAdapter(new OuterBird());
        Doorman doorman =new Doorman();
        doorman.쫓아내(rabbit);
        doorman.쫓아내(bird);

    }
}
