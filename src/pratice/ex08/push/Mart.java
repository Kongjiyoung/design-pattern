package pratice.ex08.push;

import pratice.ex08.push.Customer;

public interface Mart {
    //1. 등록
    void add(Customer customer);

    //2, 출판
    void received();

    //3. 알림
    void notify(String msg);

    //4. 취소
    void remove(Customer customer);
}
