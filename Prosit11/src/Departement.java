import java.util.Objects;

public class Departement {
    private int id;
    private String nomDept;
    private int nbEmp;

    public Departement(){}
    public Departement(int id, String nomDept, int nbEmp) {
        this.id = id;
        this.nomDept = nomDept;
        this.nbEmp = nbEmp;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDept='" + nomDept + '\'' +
                ", nbEmp=" + nbEmp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return getId() == that.getId()  && Objects.equals(getNomDept(), that.getNomDept());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDept, nbEmp);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    public int getNbEmp() {
        return nbEmp;
    }

    public void setNbEmp(int nbEmp) {
        this.nbEmp = nbEmp;
    }
}
