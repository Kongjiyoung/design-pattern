package pratice.ex08.push;

public class Cus1 implements Customer{
    @Override
    public void update(String msg) {
        System.out.println("손님1의 받은 알림 : "+msg);
    }
}
