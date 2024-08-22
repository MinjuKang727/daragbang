package camp.sparta.generic;

import java.util.ArrayList;
import java.util.List;

public class Step1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        int intSum = 0;
        for (int i = 0; i < intList.size(); i++) {
            intSum = intSum + intList.get(i);
        }

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        doubleList.add(4.4);
        doubleList.add(5.5);

        double doubleSum = 0;
        for (int i = 0; i <  doubleList.size(); i++) {
            doubleSum = doubleSum + doubleList.get(i);
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("일");
        stringList.add("이");
        stringList.add("삼");
        stringList.add("사");
        stringList.add("5");

        String sentence = "";
        for (int i = 0; i < stringList.size(); i++) {
            sentence = sentence + stringList.get(i);
        }

        System.out.println("int 값을 합산한 결과는 : " + intSum);
        System.out.println("double 값을 합산한 결과는 : " + doubleSum);
        System.out.println("단어를 합쳐 한 문장으로 만든 결과는 : " + sentence);
    }


}