package part5;

import java.io.IOException;

public class AntiPattern {

    // finally에서 return하는 경우
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
}
