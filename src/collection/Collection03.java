package collection;
/*
문제 설명
전국의 도시 이름과 소재지 받기 : 이전 Collection01과 02에서는,
단순히 도시 이름만 저장하였기 때문에 이 도시가 어느 도에 위치해 있는지 저장할 수 없었습니다.
따라서 이번에는 도시 이름과 소재지(경기도, 강원도, 충청북도 등)을 key-value 쌍으로 입력하고 저장하여 출력해보도록 하겠습니다.
도시 이름은 유일무이 하지만, 소재지는 겹칠 수 있기 때문에 입력 값에 누락이 없도록 key와 value를 잘 설정해 주어야 합니다.
만약, 도시 이름이 중복되어 들어온 경우에는 소재지가 업데이트 되지 않도록 해주세요.
마찬가지로, exit 입력을 받기 전까지만 도시와 소재지를 저장합니다.

[입력 예시]
원주 강원도
충주 충청북도
창원 경상남도
수원 경기도
성남 경기도
성남 경상남도

[출력 예시]
원주은(는) 강원도에 있습니다.
충주은(는) 충청북도에 있습니다.
창원은(는) 경상남도에 있습니다.
수원은(는) 경기도에 있습니다.
성남은(는) 경기도에 있습니다.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection03 {
    public static void main(String[] args) {
        // 1. 도시와 소재지를 받기 위해 Map을 선언, 생성합니다. 도시, 소재지 모두 String 타입입니다.
        Map<String, String> cities = new HashMap<>();

        // 콘솔 입력을 받기 위한 Scanner 객체를 선언합니다.
        Scanner scan = new Scanner(System.in);

        // 2. exit가 들어올 때 까지 반복하기 위해 while문에 조건을 true로 설정합니다.
        while (true) {
            System.out.println("도시 목록을 입력합니다.");

            // 3. 도시를 콘솔 입력으로 받기 위해 scan.nextLine()으로 받아 String 자료형(변수명 : input)에 할당합니다.
            String input = scan.nextLine();

            // 4. input 값이 exit인 경우를 조건문인 if문을 통해 찾습니다.
            if (input.equals("exit")) {
                // 4번의 조건에 부합하는 경우, 반복문을 나가기 위해 break를 사용합니다.
                break;
            }

            // 5. String 배열(변수명 : separatedInput)을 선언하고,
            // input.split(" ")를 이용하여 문자열을 공백 기준으로 나눈 것을 배열에 할당합니다.
            // (이 때, input.split(" ")를 통해 길이가 2인 String 배열이 만들어집니다.
            //   도시는 separatedInput[0], 소재지는 separatedInput[1]이 됩니다.)
            String[] separatedInput = input.split(" ");

//            // 6. 조건문인 if문으로 도시가 존재하지 않는 경우를 Map의 containsKey 메소드에 seperatedInput[0]을 파라미터로 넘겨 확인합니다.
//            if (!cities.containsKey(separatedInput[0])) {
//                // 6번의 조건에 부합하면, 도시와 소재지를 Map에 추가합니다.
//                cities.put(separatedInput[0], separatedInput[1]);
//            }
            // (혹은, 조건문을 이용하지 않고 Map의 putIfAbsent 메소드로 key값이 없는 경우에만 추가하도록 할 수 있습니다.)
            cities.putIfAbsent(separatedInput[0], separatedInput[1]);
        }

        //7. Map의 keySet()을 순회하기 위해 향상된 for문을 선언합니다.
        for (String city : cities.keySet()) {
            // 8. 형식대로 도시와 소재지를 출력해줍니다.
            System.out.printf("%s은(는) %s에 있습니다.\n", city, cities.get(city));
        }
    }
}