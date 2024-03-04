package books;

public class Book {
  String title;
  int id;
  int quantity;
  String genre;
  String loanDate;
  String returnDate;
  boolean avilable; 

    public Book(String title, int id, int quantity, String genre) {
        this.title = title;
        this.id = id;
        this.quantity = quantity;
        this.genre = genre;
        this.avilable=true;
    }

public void lendBook(){
 this.avilable = false;
}


void returnBook() {
  this.avilable = true;
}

    public boolean isAvilable() {
        return avilable;
    }




}