package ex04;

public class Doorman {

    static Doorman instacne = new Doorman();

    private Doorman(){}

    public void 쫓아내(Animal a){
        System.out.println(a.getName()+" 쫓아내");
    }
}
