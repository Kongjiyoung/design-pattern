package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class EMart implements Mart{

    private List<Customer> customerList = new ArrayList<>(); //구독자 명단

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void remove(Customer customer){
        customerList.remove(customer);
    }


    @Override
    public void received() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(".");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //....알림 -> 외부에서 받는 거
        }
        notify("EMart : 딸기");
    }

    @Override
    public void notify(String msg) {
        customerList.forEach(customer -> {
            customer.update(msg);
        });
    }
}
