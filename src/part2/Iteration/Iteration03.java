package Iteration;

/*
    문제 설명
    연속으로 야근한 날짜 출력 : 80% 확률로 야근을 한다고 할 때, 연속으로 야근한 날이 며칠인지 출력해주세요. 단, 합법적으로 연속으로 야근할 수 있는 날은 최대 10일이며, 야근을 전혀 하지 않은 경우는 0일로 계산합니다.

    출력 예시
    보셨나요? 저의 10일 연속 야근!
*/
public class Iteration03 {

    public static void main(String[] args) {
        // 야근한 날을 계산하기 위해 변수를 선언합니다.
        int overworkDays = 0;

        // 1. 반복문 while문을 선언합니다. 조건식은 야근 확률인 80%를 구현하기 위해 (Math.random() < 0.8)를 사용할 수 있습니다.
        while (Math.random() < 0.8) {
            // 야근할 확률에 당첨되었다면(조건문이 참이라면), 야근한 날을 1일씩 더해줍니다.
            overworkDays++;

            // 3. 야근한 날짜가 10일이 되었는지 if문을 통해 확인합니다.
            if (overworkDays == 10) {
                // 10일이 되었다면, 더 이상의 야근은 불법이므로 반복문을 break 키워드를 이용하여 빠져나갑니다.
                break;
            }

        }

        // 야근 일 수를 출력해줍니다.
        System.out.printf("보셨나요? 저의 %d일 연속 야근!", overworkDays);
    }
}
