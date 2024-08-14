package part3;

public class Book {
    // 제목
    private String title;
    // 저자
    private String author;
    // 대여여부 (true : 대여 가능/ false : 대여 중)
    private boolean isAvailable;

    // 생성자
    Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // 책 제목 조회
    public String getTitle() {
        return this.title;
    }

    // 책 대여여부 조회
    public boolean getAvailable() {
        return this.isAvailable;
    }

    // 책 대여여부 설정
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // 책 상세 정보 출력
    public void printInfo() {
        System.out.printf("[%s] 저자 : %s (%s)\n", this.title, this.author, (this.isAvailable) ? "대여 가능" : "대여 중");
    }
}
