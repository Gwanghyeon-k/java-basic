package class4.problem1;

public class Book {
    String title;
    String author;
    int page;

    // this()는 생성자 가장 처음에 나올 수 있기 때문에 수정
    Book(){
//        this.title = " ";
//        this.author = " ";
//        this.page = 0;
        this("","",0);
    }

    Book(String title, String author){
//        this.title = title;
//        this.author = author;
//        this.page = 0;
        this(title, author, 0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: " + title + ", 저자: " + author + ""
                + ", 페이지: " + page);
    }
}
