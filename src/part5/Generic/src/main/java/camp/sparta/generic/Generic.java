package camp.sparta.generic;

//public class Generic<T, U> {
//    private T t;
//    private U u;
//
//    public T get() {
//        return this.t;
//    }
//
//    public U get2() { return this.u; }
//
//    public void set(T t) {
//        this.t = t;
//    }
//    public void set2(U u) { this.u = u; }
//
//    // <T> : 이 메서드는 제네릭 메서드야!
//    // (<> 안에 메서드에서 사용하는 제네릭 타입 적어주기, 여러개 써도 됨.)
//    // <> 뒤에 반환 타입 적어주기 (제네릭으로 써도 됨.)
//    public <T> T function(T param) {
//        return param;
//    }
//
//    public <T, U> Long function2(U param) {
//        Long l = 0L;
//        return l;
//    }
//}

public class Generic<T extends Number> {
    private T t;

    public T get() { return this.t; }

    public void set(T t) { this.t = t; }
}