package part5;

import java.io.IOException;

// 이렇게 예외처리 하지 맙시다!
public class AntiPattern {

    // 1. catch문 body를 비워둔 경우
    public int swallow(String str) {
        try {

        } catch (Exception e) {} // <===== 꿀꺽

        return 0;
    }

    // 2. catch문에 printStackTrace(); 코드만 있는 경우
    public int swallow2(String str) {
        try {
            ////
        } catch (Exception e) {
            e.printStackTrace();

        } // <===== 꿀꺽

        return 0;
    }

    // 3. throws를 작성하지 않은 경우
//    public int swallow3(String str) {
    public int swallow3(String str) throws IncorrectFileNameException { // throw하는 예외가 있으면 signature 영역에 꼭 throws를 작성해 줍시다.
        try {
            ////
        } catch (Exception e) {
            throw new IncorrectFileNameException();

        } // <===== 꿀꺽

        return 0;
    }

    // 4. finally에서 return하는 경우
    public int finallyReturn(String str) throws IOException {
        int result = 0;

        try {

        } catch (Exception e) {
            throw new IOException();
        } finally {
//            return result;  // finally는 무조건 실행하는 구문이므로 여기서 반환x
        }

        // return은 try-catch문 밖에서
        return result;
    }

    // 5. finally에서 예외를 던지는 경우
    public int finallyThrow(String str) {
        try {
            ////
        } catch (Exception e) {
            throw new IncorrectFileNameException(); // <=== 얘 어디갔어 222

        } finally {

            throw new IncorrectFileExtensionException();
        }
    }
}