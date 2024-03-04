package com.mycompany.prestamo.libros;

import books.Book;

public class PrestamoLibros {

    public static void main(String[] args) {
        Book book1= new Book("Harry Potter", 1, 5, "fantasia" );
        Book book2= new Book("El nombre del veinto", 2, 1, "fantasia" );
        
        book1.lendBook();
        
      System.out.println(book1.isAvilable());
      System.out.println(book2.isAvilable());
    } 
}
