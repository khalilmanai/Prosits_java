import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{


    HashSet<Departement>  dept = new HashSet();
    @Override
    public void ajouterDepartement(Departement departement) {
        dept.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
      return true;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
      return  dept.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
dept.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(dept);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        Collections.sort(dept , Comparator);
    }
}
