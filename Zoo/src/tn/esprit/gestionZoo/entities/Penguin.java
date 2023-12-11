package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic {


     private float swimmingSpeed;
    public Penguin(String family, String name, int age, boolean isMammal, String habitat , float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
    this.swimmingSpeed= swimmingSpeed;
    }






@Override
    public String toString(){
        return "this animal is a pengiun and his family is "+family +" his name is " + name + " aged " + getAge() + "his habitat is " + habitat+ "and his swimming speed is "+swimmingSpeed+ " is mammal : " + isMammal;
    }

    public void swim(){
        System.out.println("this penguin can swim ");
    }








}





