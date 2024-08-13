package collection;

/*
문제 설명
전국의 도시 이름 받기 : 전국의 도시를 계속 입력 받아 List에 저장하고, exit를 입력하면 도시 입력을 중지합니다. 만약, 추가하려는 도시 이름이 이미 List에 있다면 추가하지 않습니다.

이후, List의 크기를 출력하고 List에 저장된 요소를 역순으로 출력합니다. 추가한 도시가 없는 경우에는 “도시 목록이 비어있습니다.”를 출력해주세요.

[입력 예시]
서울
인천
파주
고양
서울
춘천
원주
부산
부산
창원
exit

[출력 예시]
도시의 개수 : 8
창원
부산
원주
춘천
고양
파주
인천
서울
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection01 {
    public static void main(String[] args) {
        // 1. 도시 목록을 받을 List를 선언, 생성합니다.
        List<String> cities = new ArrayList<>();

        // 콘솔 입력을 받기 위한 Scanner 객체를 선언합니다.
        Scanner scan = new Scanner(System.in);

        // 2. exit가 들어올 때 까지 반복하기 위해 while문에 조건을 true로 설정합니다.
        while (true) {
            System.out.println("도시 목록을 입력합니다.");

            // 3. 도시를 콘솔 입력으로 받기 위해 scan.nextLine()으로 받아 String 자료형(변수명 : city)에 할당합니다.
            String city = scan.nextLine();

            // 4. city 값이 exit인 경우를 조건문인 if문을 통해 찾습니다.
            if (city.equals("exit")) {
                //  4번의 조건에 부합하는 경우, 반복문을 나가기 위해 break를 사용합니다.
                break;
            }

            // 5. 도시 목록에 city로 받은 도시 이름이 없는 경우를 조건문인 oo문을 통해 찾습니다.
            if (!cities.contains(city)) {
                // 5번의 조건에 부합하는 경우, 도시 목록에 city를 추가합니다.
                cities.add(city);
            }
        }

        // 6. 도시의 개수를 옆의 형식과 같이 출력합니다. (도시의 개수 : {개수})
        System.out.printf("도시의 개수 : %d\n", cities.size());

        // 7-1. 조건문인 if문과 List의 isEmpty 메소드를 이용하여 List가 비어있는지 확인합니다.
        if (cities.isEmpty()) {
            // 도시 목록이 비어있습니다. 를 출력합니다.
            System.out.println("도시 목록이 비어있습니다.");
        } else {  // 7-2. 7-1 조건에 해당하지 않은 경우를 위해 조건문인 else문을 이용합니다.
            // 도시 목록의 역순 출력을 위해 반복문 for를 사용하고, 초기문을 size() 메소드를 이용하여 인덱스를 지정합니다.
            for (int i = cities.size() - 1; i >= 0; i--) {
                // List의 요소에 접근하여 도시를 출력합니다.
                System.out.println(cities.get(i));
            }
        }
    }
}