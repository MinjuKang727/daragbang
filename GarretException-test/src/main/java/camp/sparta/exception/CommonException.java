package camp.sparta.exception;

// 커스텀 Exception을 상황별로 만들기 귀찮을때
public class CommonException extends Exception {
// unchecked Exception을 상속 받으면
//    CommonException이 발생할 수 있는 메서드를 사용해도 예외 처리를 하라고 빨간 줄이 안뜸.
//    checkedException을 던지는 메서드는 예외 처리안하면 빨간 줄 뜸.

    private Code code;

    public CommonException(Code code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}

;

