package part3_practice;

public class Main {
    /*
    프로그램 시작점
     */
    public static void main(String[] args) {

        // 인스턴스화 시켰다.
        Coffee coffeeA = new Coffee("mix", "ice");
        Coffee coffeeB = new Coffee("maxim", "hot");

        // coffeeA에 담긴 것은 데이터의 주소(참조형)
        coffeeA.drink();

    }
}
