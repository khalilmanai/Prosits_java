import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee>, Comparator<Employee> {

    private List<Employee> employes = new ArrayList<>();

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employee employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee emp : employes) {
            if (emp.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employee employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employee emp : employes) {
            System.out.println(emp);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes , this::compare);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                // Compare by name
                int nameComparison = emp1.getNom().compareTo(emp2.getNom());

                // If names are equal, compare by department
                if (nameComparison == 0) {
                    int deptComparison = emp1.getNomDept().compareTo(emp2.getNomDept());

                    // If departments are equal, compare by grade
                    if (deptComparison == 0) {
                        return (emp1.getGrade() == emp2.getGrade());
                    }

                    return deptComparison;
                }

                return nameComparison;
            }
        });
    }

    // Remaining compare method (used for sorting)
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int nameComparison = emp1.getNom().compareTo(emp2.getNom());

        if (nameComparison == 0) {
            return Integer.compare(emp1.getId(), emp2.getId());
        }

        return nameComparison;
    }
}
