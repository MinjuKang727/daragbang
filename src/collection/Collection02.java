package collection;

/*
문제 설명
전국의 도시 이름 받기 2 : 이전 Collection01.java에서는 중복된 도시 이름을 거르기 위해 별도의 로직이 필요했습니다.
이제는 중복을 처리하기 귀찮으니 비효율적이니 Set을 사용해보고자 합니다.

Collection01.java와 같이 exit 입력을 받기 전까지 도시 이름을 입력 받아 Set에 저장해봅니다.
추가적으로 이번에는 스파이를 색출하기 위해 도시를 모두 받은 이후에 “평양”이라는 도시가 Set에 있다면 삭제해줍시다.

Set은 향상된 for문으로 요소에 접근하여 요소를 모두 출력할 수 있지만,
귀찮기 때문에 toString() 메소드를 이용하여 명시적으로 반복문을 작성하지 않고 출력하려고 합니다.
마찬가지로, 입력한 도시가 없거나, 모두 스파이로 색출되어 도시 Set이 비어있는 경우에는 “도시 목록이 비어있습니다.”를 출력해주세요.

[입력 예시]
서울
인천
파주
서울
평양
평양
서울
exit

[출력 예시]
도시의 개수 : 3
[서울, 파주, 인천]
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection02 {
    public static void main(String[] args) {
        // 1. 도시 목록을 받을 Set를 선언, 생성합니다.
        Set<String> cities = new HashSet<>();

        // 콘솔 입력을 받기 위한 Scanner 객체를 선언합니다.
        Scanner scan = new Scanner(System.in);

        // 2. exit가 들어올 때 까지 반복하기 위해 while문에 조건을 true로 설정합니다.
        while (true) {
            System.out.println("도시 목록을 입력합니다.");

            // 3. 도시를 콘솔 입력으로 받기 위해 scan.nextLine()으로 받아 String 자료형(변수명 : city)에 할당합니다.
            String city = scan.nextLine();

            // 4. city 값이 exit인 경우를 조건문인 if문을 통해 찾습니다.
            if (city.equals("exit")) {
                // 4번의 조건에 부합하는 경우, 반복문을 나가기 위해 break를 사용합니다.
                break;
            }

            // 5. 도시 목록에 city를 추가합니다.
            cities.add(city);
        }

        // 6. Set에 입력 받은 도시를 모두 저장한 후, "평양"이라는 도시를 지웁니다. (조건문을 추가하셔도 좋습니다!)
        cities.remove("평양");

        // 7. 도시의 개수를 옆의 형식과 같이 출력합니다. (도시의 개수 : {개수})
        System.out.printf("도시의 개수 : %d\n",cities.size());

        // 8-1. 조건문인 if문과 Set의 isEmpty 메소드를 이용하여 Set이 비어있는지 확인합니다.
        if (cities.isEmpty()) {
            // 도시 목록이 비어있습니다. 를 출력합니다.
            System.out.println("도시 목록이 비어있습니다.");
        } else {  // // 8-2. 8-1 조건에 해당하지 않은 경우를 위해 조건문인 else문을 이용합니다.
            System.out.println(cities.toString());
        }
    }
}