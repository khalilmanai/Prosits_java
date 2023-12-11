import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{

      HashSet<Departement>  hashset = new HashSet<>();



    @Override
    public void ajouterDepartement(Departement departement) {
       hashset.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {

        if(hashset.contains(nom)){
            return true;
        }

        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        if(hashset.contains(departement)){
            return true;
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
     hashset.remove(departement);
    }

    @Override
    public void displayDepartement() {
         for(Departement dept : hashset){
             System.out.println("Departement : "+ dept);
         }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> ts = new TreeSet<>();
        ts.addAll(hashset);
        return ts;
    }
}
