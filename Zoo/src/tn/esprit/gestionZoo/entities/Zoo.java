package tn.esprit.gestionZoo.entities;

public class Zoo {
     public Animal[] animals;
      private  String name ;
      public String city ;
       public int nbrCages=25;

       public Aquatic[] aquaticAnimals = new Aquatic[10];




       public String getName(){
           return this.name;
       }
       public void setName(String name){
           this.name =  name;
       }


       public Zoo (  String name , String city , int nbrCages){
           animals = new Animal[nbrCages];
           this.name  = name;
           this.city  = city;
           this.nbrCages = nbrCages;
       }
    public void displayZoo(){
        System.out.println(name + " existe a la  "+ city+ " est comporte "+ nbrCages );
    }

    public boolean addAnimal(Animal animal){

              if(isZooFull()){
                  for (int i=0 ; i < animals.length ; i++){
                      if(animals[i]== null){
                          animals[i]= animal;

                          System.out.println(" new animal added successfully");
                          return  true;
                      }

                  }
                  System.out.println("failed to add a new animal ");
                  return  false;
              }
              return  false;
    }






      public  void showAnimal(){

           for(Animal animal : animals){

               if(animal != null){
                   System.out.println(animal.family +" "+ animal.name +" " + animal.getAge());
               }
           }
      }



      public int searchAnimal(Animal animal ){
           for(int i = 0 ; i < animals.length ; i++){
               if(animals[i].equals(animal.name)){
                   return i;
               }
           }
           return -1;
      }



      public boolean isZooFull(){
           if(animals.length == nbrCages ){
               System.out.println("this zoo is not full");
               return true;
           }else {

               System.out.println("the zoo is full");
               return false;
           }
      }





      public Zoo comparerZoo(Zoo z1 , Zoo z2) {
          if (z1.animals.length > z2.animals.length) {
              System.out.println(" le premier zoo et plus grand que le deuxieme zoo");
              return z1;

          } if(z1.animals.length == z2.animals.length) {
              System.out.println("les deux zoo sont equivaut");
              return null;
          }

          System.out.println(" le deuxieme zoo et plus grand");
          return z2;
      }




    public float maxSwimmingDepth(){
        float maxDepth = 0;



        for(Aquatic aquatic : aquaticAnimals){
            if(aquatic instanceof Dauphin){
                if(((Dauphin) aquatic).swimmingDepth > maxDepth){
                    maxDepth = ((Dauphin) aquatic).swimmingDepth ;
                } else {
                    System.out.println(" No swimming Depth property for this animal please make sure that it's a dolphin");
                }
            }
        }
        return maxDepth;
    }


    public void displayNumberOfAquaticsByType(){
           int nbrPenguin=0;
           int nbrDauphin=0;
           for (Aquatic aquatic : aquaticAnimals){
               if(aquatic instanceof Penguin){
                   nbrPenguin++;
               }
               if(aquatic instanceof Dauphin){
                   nbrDauphin++;
               }
           }

           System.out.println("nombre des penguin est : "+ nbrPenguin);
           System.out.println("nombre des dauphins est : " + nbrDauphin);
    }























}
