package com.javalovers.ejercicio_restaurante;
import java.util.Scanner;
import menu.Food;
import values.CustomerRole;
import people.Customer;


public class Ejercicio_restaurante {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Customer administrative= new Customer(CustomerRole.ADMINISTRATIVE, "1", "Pepito Perez");
        administrative.sellFood();
        /*Food food1= new Food("calentado",1,20,"Breakfast");
        Food food2= new Food("Arroz chino",2,20,"Launch");
        Food food3= new Food("Pepito",3,20,"Dinner");
        
        System.out.println("Ingrese si es:");
        System.out.println("1.Estudiante");
        System.out.println("2.Docente");
        System.out.println("3.Administrativo");
        
        int role;
        role=sc.nextInt();
        
        switch(role){
            case 1:
        System.out.println("El valor de su comida sera:" + "2.400");
        System.out.println("¿Que desea comprar?");
        System.out.println("1.Desayuno");
        System.out.println("2.Almuerzo");
        System.out.println("3.Cena");
        break;
            case 2:
        System.out.println("El valor de su comida sera:" + "8.400");
        System.out.println("¿Que desea comprar?");
        System.out.println("1.Desayuno");
        System.out.println("2.Almuerzo");
        System.out.println("3.Cena");
        break;
            case 3:
        System.out.println("El valor de su comida sera:" + "8.400");
        System.out.println("¿Que desea comprar?");
        System.out.println("1.Desayuno");
        System.out.println("2.Almuerzo");
        System.out.println("3.Cena");
        break;
            
        
        }
    */}
}
