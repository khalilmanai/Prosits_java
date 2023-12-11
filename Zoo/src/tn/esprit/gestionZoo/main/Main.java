package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.Animal;
import tn.esprit.gestionZoo.entities.Penguin;
import tn.esprit.gestionZoo.entities.Zoo;

public class Main {


    public static void main (String[] args){

        Zoo zoo = new Zoo("my zoo" , "Tunis" , 20);
        Zoo zoo1 = new Zoo("my zoo1" , "Tunis" , 20);
        Animal animal = new Animal("Lions" , "leo" , 10 , true);
        Penguin p = new Penguin("peng" , "skipper" ,10 , true , "land" , 10.1f);
        zoo.addAnimal(animal);

        zoo.showAnimal();
       System.out.println(p.toString());
    }




}
