public class Departement
{

 private int id;
 private String nomDept;
 private int nbEmp;




  public Departement(){};
    public Departement(int id, String nomDept, int nbEmp) {
        this.id = id;
        this.nomDept = nomDept;
        this.nbEmp = nbEmp;
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


    public boolean equals(Departement D){
        return this.id == D.id && this.nomDept.equals(D.nomDept);
    }


    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDept='" + nomDept + '\'' +
                ", nbEmp=" + nbEmp +
                '}';
    }
}
