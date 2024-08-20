package part4.food;

import java.util.List;

public abstract class Burger {
    // 패티
    Integer patty;
    // 야채
    List<String> vegetables;
    // 추가 재료
    List<String> extras;

    Integer price;

    // 버거 레시피
    public abstract Burger recipe();
}
