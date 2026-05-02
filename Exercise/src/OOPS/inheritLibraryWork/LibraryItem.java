package OOPS.inheritLibraryWork;

public class LibraryItem {
    protected int itemID;
    protected String title;
    protected String author;

//    public LibraryItem(String author, String title, int itemID) {
//        this.author = author;
//        this.title = title;
//        this.itemID = itemID;
//    }

    public void checkout(){
        System.out.println("Checkout");
    }

    public void returnItem(){
        System.out.println("Returning the item");
    }
}
class Books extends LibraryItem{

    private String bookIsbn;

    Books(String bookIsbn){
        this.bookIsbn = bookIsbn;
    }
}
class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}

class DVD extends LibraryItem{
    private String duration;

    public DVD(String duration) {
        this.duration = duration;
    }
}
class testMain{
    public static void main(String[] args) {
        LibraryItem LI = new LibraryItem();
        Books b1 = new Books("B1Maths");
        Magazine M1 = new Magazine(123);
        DVD d1 = new DVD("23 Minutes");
        d1.checkout();
        d1.author = "Aditya Dhar";
        System.out.println(d1.author);
    }
}