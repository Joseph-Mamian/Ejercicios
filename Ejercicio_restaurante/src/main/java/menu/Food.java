package menu;

import values.DishType;

public class Food {
    DishType type;
    String name;
    int price;
    int quantity;
    
    
    public Food(String name, int id, int quantity, String type){
    this.name = name;
    this.price=id;
    this.quantity= quantity;
    
   }
}


