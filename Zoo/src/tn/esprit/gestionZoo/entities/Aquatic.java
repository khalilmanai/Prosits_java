package tn.esprit.gestionZoo.entities;

public abstract class Aquatic extends Animal{


    public String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal , String habitat ) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }




     public abstract void swim();


       public boolean equals(Aquatic aquatic){
           return (this.name.equals(aquatic.name) && this.habitat.equals(aquatic.habitat) && this.age.equals(aquatic.age));
       }







}
