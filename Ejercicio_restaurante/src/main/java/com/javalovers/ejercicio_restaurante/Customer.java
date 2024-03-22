package com.javalovers.ejercicio_restaurante;

public class Customer {
    CustomerRole role;
    String id;
    String fullname;
    int price;

    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
   
    void SayMenu(){
        
    }
    
    void buyFood(){
        if (null != this.role)switch (this.role) {
            case STUDENT -> {
                System.out.println("¿Que desea comprar hoy?");
                price= 2400;
                System.out.println("Su pedido tendra el coste de: " + price );
            }
            case TEACHER -> {
                System.out.println("¿Que desea comprar hoy?");
                price= 8200;
                System.out.println("Su pedido tendra el coste de: " + price);
            }
            case ADMINISTRATIVE -> System.out.println("USted solo puede vender");
            default -> {
            }
        }
        System.out.println("Ingrese que tipo de comida quiere comprar");
    }
    
    void cancelBuy(){
    }
    
    public void sellFood(){
    if (this.role != CustomerRole.ADMINISTRATIVE){
    System.out.println("Usted no tiene permiso para vender");
    return; 
    }
    System.out.println("Ya te atiendo ");
    
  }
}
