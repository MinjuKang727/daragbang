package camp.sparta.exception;

public class IncorrectIndexException extends IndexOutOfBoundsException {
    IncorrectIndexException(int index, int length) {
        super("인덱스가 0 ~ " + (length - 1) + "범위를 벗어났습니다. (인덱스 : " + index + ")");
    }
}
