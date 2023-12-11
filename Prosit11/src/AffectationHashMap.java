import java.util.*;
public class AffectationHashMap {

    Map<Employee , Departement> hashmap;


    public AffectationHashMap() {
        this.hashmap =  new HashMap();
    }

    public void ajouterEmployeeDepartement(Employee e , Departement d) {
        hashmap.put(e , d);
    }

    public void afficherEmployesEtDepartements(){
        System.out.println(hashmap);
    }

    public void supprimerEmployee(Employee e){
        hashmap.remove(e);
    }


    public boolean supprimerEmployeeEtDepartement(Employee e , Departement d){
      return   hashmap.remove(e , d);
    }



    public void afficherEmployees(){
        for(Map.Entry<Employee , Departement> entry : hashmap.entrySet()){
            System.out.println("key = " +  entry.getKey());
        }
        // or use hashmap.keyset()
    }

    public void afficherDepartements(){
        for(Map.Entry<Employee , Departement> entry : hashmap.entrySet()){
            System.out.println("key = " +  entry.getValue());
        }

        //or use hashmap.values
    }

    public boolean rechercheEmployee(Employee e){
           return  hashmap.containsKey(e);
    }



    public TreeMap<Employee, Departement> trierMap() {
   /*
        TreeMap<Employee, Departement> sortedMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getId() - e2.getId();
            }
        });

        sortedMap.putAll(hashmap);

        return sortedMap;

    */
        return new TreeMap<>(hashmap);
    }
}


