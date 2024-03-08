package com.mycompany.prestamo.libros;

import books.Book;
import java.util.Scanner;
public class PrestamoLibros {
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Book book1= new Book("Harry Potter", 1, 5, "fantasia" );
        Book book2= new Book("El nombre del veinto", 2, 1, "fantasia" );
        Book book3= new Book("1984", 3, 3, "ciencia ficcion" );
        Book book4= new Book("el diario en la botella", 4, 9, "ciencia ficcion" );
        
        book1.gggg();
        book2.gggg();
        book3.gggg();
        book4.gggg();
       
        /*if (book1.gggg()>0){
            System.out.println("Hay libros que pueden ser prestados");
        }
        else if (book1.gggg()<=0){
            System.out.println("No hay libros que pueden ser prestados");
        }*/
        
        System.out.println("Harry Potter id:1");
        System.out.println("Harry Potter id:2");
        System.out.println("Harry Potter id:3");
        System.out.println("Harry Potter id:4");
        
        
        System.out.println("Escriba la id del numero que quiere alquilar");
        int Q= leer.nextInt();
        
        
        if (Q==1){
            if (book1.gggg()>0){
            System.out.println("Hay libros que pueden ser prestados");
        }
        else if (book1.gggg()<=0){
            System.out.println("No hay libros que pueden ser prestados");
        }
    }
        
    }
}
