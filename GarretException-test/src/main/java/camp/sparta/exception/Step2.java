package camp.sparta.exception;

public class Step2 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3};

        int index = 4;
        try {
            int element = list[index];
            System.out.println("결과 : " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스가 유효범위를 벗어났습니다.");
        }
    }
}
