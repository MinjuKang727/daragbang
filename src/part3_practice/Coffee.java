package part3_practice;
/*
커피 객체 == 클래스
 */
public class Coffee {
    // 1. 속성(변수)
    // 접근 제어자 - 정보 은닉을 위해(public, private, ...)
    private String beeanType; // 커피콩 종류
    private String coffeeType;  // 커피 타입

    // 2. 생성자 == 객체의 조립 설명서
    // 매개변수는 지역변수 필드 변수와 동일한 이름을 가지면 this 키워드를 빼면 에러남.
    // 서로 다른 이름을 붙이면 해결 됨.
    Coffee(String beanType, String coffeeType) {
        // this : 현재 인스턴스의 주소를 가리킴
        // 객체는 인스턴스화 되면 힙에 올라감. 여기서 올라간 주소
        this.beeanType = beanType;
        this.coffeeType = coffeeType;
    }

    // 3. 메서드 영역(기능)
    public static void drink() {
        System.out.println("커피를 마십니다.");
    }
}
