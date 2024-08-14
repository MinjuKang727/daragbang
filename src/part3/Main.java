package part3;

public class Main {
    public static void main(String[] args) {
        // 1. 도서관 객체 생성
        Library library = new Library();

        // 2. 책 객체 4개 생성
        Book bookA = new Book("당신이 누군가를 죽였다.", "히가시노 게이고", true);
        Book bookB = new Book("캐치! 티니핑 캐릭터 도감", "피티엘 편집부", true);
        Book bookC = new Book("에도가와 란포 기담집", "에도가와 란포", true);
        Book bookD = new Book("다시, 역사의 쓸모", "최태성", true);

        // 3. 도서관에 책 추가
        library.addBook(bookA);
        library.addBook(bookB);
        library.addBook(bookC);
        library.addBook(bookD);

        // 4. 도서관에서 책 제거
        library.removeBook(bookD);

        // 5. 도서관의 모든 책 출력
        library.pringBookList();

        // 6. 도서관에서 책 대여
        try{
            library.rentBook(bookA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // 7. 도서관에서 책 반납
        try {
            library.returnBook(bookA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
