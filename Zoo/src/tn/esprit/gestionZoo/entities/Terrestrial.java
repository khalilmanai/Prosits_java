package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animal{


    public int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal , int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
}
