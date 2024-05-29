package pratice.ex08.push;

public class App {
    public static void main(String[] args) {
        //1. Bean 로드
        Mart lotteMart = new LotteMart();
        Mart emart = new EMart();
        Cus1 cus1 = new Cus1();
        Cus2 cus2 = new Cus2();

        //2. 구독
        lotteMart.add(cus1);
        lotteMart.add(cus2);

        emart.add(cus1);
        emart.add(cus2);

        //3. 구독 취소
        lotteMart.remove(cus2);

        //4. 출판
        new Thread(() -> {
            lotteMart.received();
        }).start();

        new Thread(() -> {
            emart.received();
        }).start();
    }
}
