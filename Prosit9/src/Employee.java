import java.util.Objects;

public class Employee {
    private int id;
    private String Nom ;
    private String prenom;
    private String nomDept;
    private  int grade;

    public Employee() {};

    public Employee(int id, String nom, String prenom, String nomDept, int grade) {
        this.id = id;
        Nom = nom;
        this.prenom = prenom;
        this.nomDept = nomDept;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }





    public boolean equals(Employee emp){
        return this.getId() == emp
                .getId() && Objects.equals(this.getNom(), emp.getNom());
    }



    public String toString(){
        return "Employee of id " +this.getId()+ " and the name of " + this.getNom()+ " and the surname of " +this.getPrenom()
                + " from the " + getNomDept() + " Departement and with the grade of  : "+getGrade();
    }
}
