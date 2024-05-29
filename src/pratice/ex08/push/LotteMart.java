package pratice.ex08.push;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart{

    List<Customer> customerList = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void received() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notify("LotteMart : 딸기");
    }

    @Override
    public void notify(String msg) {
        customerList.forEach(customer -> {
            customer.update(msg);
        });
    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }
}
