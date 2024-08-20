package part4.food;

import java.util.List;

public class Whopper extends Burger {
    String bunOption;

    public Whopper() {
        super();
        this.bunOption = "GLAZED";
    }

    @Override
    public Burger recipe() {
        // 패티 굽기
        this.grillPatty();
        // 야채 추가
        // TODO method가 추가될 예정
//        super.vegetables = List.of(
//                "Tomato", "Lettuce", "Onion", "Pickle"
//        );
        // 버거를 리턴
        return this;
    }

    // 패티 110g을 특별하게 굽는 메서드 구현하기
    public void grillPatty() {
        super.patty = 110;
    }
}
