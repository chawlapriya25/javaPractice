package excercise;

public class Book {
    private String bookName;
    private String ISBN;
    private String Author;
    private String publisher;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    Book(String bookName, String ISBN, String  Author, String publisher){
        this.bookName=bookName;
        this.ISBN=ISBN;
        this.Author=Author;
        this.publisher=publisher;

    }
    Book(){
        bookName="wow";
        ISBN="37BHJ89";
        Author="pANDIT";
        publisher="cANDAN";

    }
    void getBookInfo(){
        System.out.printf("%s %s %s %s",bookName,ISBN,Author,publisher);


    }

        public static void main(String[] args) {
            Book book[]= new Book[13];
            book[1]=new Book();
            book[1].getBookInfo();


        }
    }

