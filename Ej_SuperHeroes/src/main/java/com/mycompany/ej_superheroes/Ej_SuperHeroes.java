package com.mycompany.ej_superheroes;

import superhero.SuperHero;

public class Ej_SuperHeroes {

    public static void main(String[] args) {
        SuperHero superhero1=new SuperHero("Badman","",false);
        superhero1.getName();
        System.out.println(SuperHero.getName(superhero1));
    }
    
}
