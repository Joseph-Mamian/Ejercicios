package com.mycompany.ej_banco.people;

public class Holder {
    String name;
    double money;

    public Holder(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public Holder(String name) {
        this.name = name;
        this.money = 0;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
   public void consigMoney (double qty){
   if (qty <= 0) {
       System.out.println("No se puede consignar"); 
     }
     this.money +=qty;
       System.out.println("Consignacion realizada");
   }
    
   public void withdrawmoney (double qty) {
   if (qty > this.money){
           System.out.println("Saldo insuficiente");
   return;
   }
   this.money -= qty;
       System.out.println("Retiro realizado");           
   }
}
