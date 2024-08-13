package Array;
/*
문제 설명
광역시 입력 받기 : 대한민국에는 서울특별시를 제외하고 총 6개의 광역시가 있습니다. 광역시를 입력받아 배열에 추가해주세요.

[ 입력 예시 ]
광역시 6개를 차례대로 입력해주세요. 엔터로 도시를 구분해주세요.
부산
대전
울산
광주
인천
대구

[ 출력 예시 ]
부산광역시
대전광역시
울산광역시
광주광역시
인천광역시
대구광역시
 */
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        // 1. 광역시를 저장할 크기가 6인 String 배열을 생성, 선언합니다.
        String[] cities = new String[6];

        // 콘솔 입력을 받기 위한 Scanner 객체를 선언합니다.
        Scanner scan = new Scanner(System.in);

        System.out.println("광역시 6개를 차례대로 입력해주세요. 엔터로 도시를 구분해주세요.");

        // 2. 광역시를 6개 받아 차례대로 배열에 넣기 위해 배열의 길이만큼 반복하는 for문을 작성합니다.
        for (int i = 0; i < 6 ; i++) {
            // 3. scan.nextLine()을 이용하여 콘솔에서 광역시를 받고, 반복문을 통해 배열의 요소에 인덱스로 접근하여 입력한 광역시를 넣어줍니다.
            cities[i] = scan.nextLine();
        }

        // 향상된 for문으로 배열을 차례로 순회하며 출력합니다.
        for(String city : cities) {
            System.out.printf("%s광역시\n", city);
        }

    }
}
