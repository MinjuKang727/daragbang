package Iteration;

/*
    [ 문제 설명 ]
    광역시 출력 : 주어진 도시 목록을 순차적으로 순회하면서 도시 앞에 “광역시 : ”를 붙여 출력해주세요.

    [ 출력 예시 ]
    광역시 : 인천
    광역시 : 부산
    광역시 : 울산
    광역시 : 광주
    광역시 : 대전
    광역시 : 대구
*/
public class Iteration02 {
    public static void main(String[] args) {

        // 고정된 도시의 목록을 선언합니다.
        String[] cities = {"인천", "부산", "울산", "광주", "대전", "대구"};

        // 1. 반복문 향상된 for문을 선언합니다. 위의 cities 배열에서 각 요소에 순차적으로 접근합니다.
        for (String city : cities) {
            // 2. 광역시 : {도시}를 출력합니다.
            System.out.printf("광역시 : %s\n", city);
        }
    }
}
