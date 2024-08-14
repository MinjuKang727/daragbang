package part3;

import java.util.ArrayList;

public class Library {
    // 책 목록
    private ArrayList<Book> books;

    // 생성자
    Library() {
        this.books = new ArrayList<>();
    }

    // 도서관에 책 추가
    public void addBook(Book book) {
        if (book != null && !this.books.contains(book)) {
            this.books.add(book);
            System.out.print("(New) ");
            book.printInfo();
        }
    }

    // 도서관에서 책 제거
    public void removeBook(Book book) {
        if (book != null && this.books.contains(book)) {
            this.books.remove(book);
            System.out.print("(해당 도서가 삭제 됩니다.) ");
            book.printInfo();
        }
    }

    // 도서관에서 책 이름으로 검색
    public Book searchBookByName(String title) throws Exception {
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }

        throw new Exception("검색하신 책이 존재하지 않습니다.");
    }

    // 도서관에서 모든 책 조회
    public void pringBookList() {
        System.out.println("\n(현재 도서관에 입고되어 있는 책 목록을 조회합니다.)");
        for (Book book : this.books) {
            book.printInfo();
        }
        System.out.printf("[총 %d권의 책이 조회되었습니다.]\n\n", this.books.size());
    }

    // 도서관에서 책 대여
    public void rentBook(Book book) throws Exception {
        if (book.getAvailable()) {
            book.setAvailable(false);
            System.out.print("(도서 대여 중...) ");
            book.printInfo();
        } else {
            throw new Exception("이미 대여 중인 책입니다.");
        }
    }

    // 도서관에서 책 반납
    public void returnBook(Book book) throws Exception {
        if (!book.getAvailable()) {
            book.setAvailable(true);
            System.out.print("(도서 반납 중...) ");
            book.printInfo();
        } else {
            throw new Exception("대여 중인 책이 아닙니다.");
        }
    }
}
