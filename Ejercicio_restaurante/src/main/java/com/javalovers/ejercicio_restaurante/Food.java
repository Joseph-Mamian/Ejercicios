package com.javalovers.ejercicio_restaurante;

public class Food {
    private DishType type;
    private String name;
    private int price;
    private String ingredents; /* to do */
    private int quantity;

    public Food(DishType type, String name, int price, String ingredents, int quantity) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.ingredents = ingredents;
        this.quantity = quantity;
    }
    
    public Dishtype getType(){
    return this.type;
   }
}


