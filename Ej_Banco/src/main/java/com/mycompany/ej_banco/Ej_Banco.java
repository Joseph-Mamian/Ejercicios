package com.mycompany.ej_banco;
import com.mycompany.ej_banco.people.Holder;

public class Ej_Banco {

    public static void main(String[] args) {
        Holder people1 = new Holder ("pepito");
        Holder people2 = new Holder ("Chucho", 500_000);
        
        people1.getName();
        people1.getMoney();
        people2.getName();
        people2.getMoney();
        
        System.out.println("El saldo de " + people1.getName() + " es de " + people1.getMoney());
        System.out.println("El saldo de " + people2.getName() + " es de " + people2.getMoney());
        
        people1.consigMoney(100_000);
        people2.consigMoney(100_000);
        
        people1.withdrawmoney(200);
        people2.withdrawmoney(-1);
        
    }
}
