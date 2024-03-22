package com.javalovers.ejercicio_restaurante;

import java.util.ArrayList;

public class Menu {

private ArrayList<Food> foodlist;

    public Menu() {
      this.foodlist = new ArrayList<>();
      
      
            
    }

    public Menu(ArrayList<Food> foodlist) {
        this.foodlist = foodlist;
    }
    
    public void addFood(Food food){
     this.foodlist.add(food);
    }
    
    public ArrayList<String> getDishType(DishType dishType){
    ArrayList<String> foundDishes = new ArrayList<>();
    
    for(Food food : foodlist){
      if(food.getType() == dishType){
         foundDishes.add(food.getName());
      }
    }
    return foundDishes;
    }
    

    
}
