package part5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionPractice {
    public static void main(String[] args) {
        ExceptionPractice sample = new ExceptionPractice();

        sample.unCheckedException4();
    }

    public void checkedException1() throws RuntimeException, IncorrectFileNameException {
        String fileName = "src/part5/sample.txt";
        FileInputStream is = null;

        try {
            // TODO @SneakyThrows?
            is = new FileInputStream(fileName);

            int i = 0;
            while ((i = is.read()) != -1) {  // 한 글자씩 불러오기
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
           throw new IncorrectFileNameException(fileName + "은 존재하지 않습니다.", e.getCause());
           // 메세지는 프론트나 사용자에게 보여주기 위함.
            // cause는 stackTrace와 같이 정확한 에러 내용을 파악하기 위함.
        } catch (IOException e) {
            throw new RuntimeException("어쩌구 저쩌구 에러");
            // 그냥 바로 throws IOException을 하고 다른 개발자에게 처리를 넘길 수도 있겠지만
            // 예외를 custom한 후에 그 예외를 던지는 것이 가장 좋음. (왜 그 예외가 발생했는지 알기 쉽게 관리)
            // signature 영역( {} 열기 전 영역) 에 예외를 throws
            // printStackTrace() (Stack 영역의 메서드가 돌아간 log를 출력해 줌.)
            // e.getMessage() : 예외에 들어있는 메세지를 출력
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException("어쩌구 저쩌구 에러");
            }
        }
    }

    public void checkedException2() throws RuntimeException {
        try {
            new SimpleDateFormat("yyyy-mm-dd").parse("invalid");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void unCheckedException1() {
        try {
            int d = 0;
            int n = 10;
            int r = n / d;

            System.out.println(r);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public void unCheckedException2() {
        try {
            int[] arr = new int[20];
            arr[20] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("어저꾸");
        }
    }

    public void unCheckedException3() {
        try {
            String str = "123rk";
            int n = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public void unCheckedException4() {
        try {
            Animal animal = new Lion();
            Dog dog = (Dog) animal;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }


}

class Animal {

}

class Dog extends Animal {

}

class Lion extends Animal {

}