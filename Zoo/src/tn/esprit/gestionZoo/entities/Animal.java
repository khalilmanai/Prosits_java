package tn.esprit.gestionZoo.entities;

public class Animal {
    public String family;
    public String name ;
     private int age ;
     public boolean isMammal;
 public Animal(String family , String name , int age , boolean isMammal ){
     this.family = family;
     this.name = name ;
     this.age = age;
     this.isMammal  = isMammal;

 }






  public int getAge(){
     return this.age;
  }


  public void setAge(int age){
    if(age < 0){
        System.out.println("must include positive age");
    } else {
        this.age = age;
    }
  }






}
