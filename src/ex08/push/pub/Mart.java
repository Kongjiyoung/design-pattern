package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart {
    //1. 등록 (구독자 등록)
    void add(Customer customer);

    //2. 출판 (축구 업로드)
    void received();

    //3. 알림 (구독자에게 알림)
    void notify(String  msg);

    //4. 취소 (구독 취소)
    void remove(Customer customer);
}
