package OOPS.librarySystem;

public class Books {

    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Books(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Books(String isbn){
        this("Unknown","Unknown",isbn);
    }

    public static int getTotalBooks(){
        return totalBooks;
    }
    public void borrowBooks(){
        if(isBorrowed){
            System.out.println(title + "'s book is already borrowed!!!");
        }
        else{
            this.isBorrowed = true;
            System.out.println("Padh lena "+ title +"'s Book");
        }

    }
    public void returnBook(){
        if(!isBorrowed){
            System.out.println(title + " book is already present in the library ");
        }
        else{
            isBorrowed = false;
            System.out.println("Hope you enjoyed the Book");
        }
    }

    public static void main(String[] args) {
        Books B1 = new Books("MATHS","RDSharma","ISBN1");
//        Books B2 = new Books("ENGLISH","WILLIAMS","ISBN2");
//        Books B3 = new Books("PHYSICS","PW","ISBN3");
        Books B4 = new Books("ISBN4");

        System.out.println("Total number of books in library : " + Books.getTotalBooks());
        B1.borrowBooks();
        B4.borrowBooks();
        B4.borrowBooks();

//        System.out.println("Total number of books in library : " + totalBooks);
        B1.returnBook();
        B1.returnBook();
//        System.out.println("Total number of books in library:" + totalBooks);
    }
}