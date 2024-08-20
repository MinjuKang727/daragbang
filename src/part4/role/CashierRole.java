package part4.role;

public interface CashierRole extends StaffRole {
    // 주문을 받는다.
    default void receiveOrder() {

    };
    // 계산한다.
    void charge();


}
