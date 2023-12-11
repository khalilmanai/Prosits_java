package tn.esprit.gestionZoo.entities;

public class Dauphin extends Aquatic{

    public float swimmingDepth;
    public Dauphin(String family, String name, int age, boolean isMammal, String habitat , float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }



  public String toString(){

        return "this animal is a dolphin  from " +family+"family and named" + name+  "aged " + getAge() + "his natural habitat is : " +habitat+ " and has a swimming depth of"+  swimmingDepth+ " and mammal is :" + isMammal;
  }


  public void swim(){
        System.out.println("this dolphin is swimming");
  }
























}

