public class EtudiantAlternance extends Etudiant{
     private int salaire;

    public EtudiantAlternance (int identifiant , String nom , String prenom , float moyenne , int salaire){

        super(identifiant , nom , prenom , moyenne);
        this.salaire = salaire;
    }


    @Override
    void ajouterUneAbsence() {
        salaire -= 50;
    }

    @Override
    public String toString() {
        return "EtudiantAlternance{" +
                "Identifiant : "+getIdentifiant()+
                "nom :"+getNom()+
                "prenom : "+getPrenom()+
                "moyenne : "+getMoyenne()+
                "salaire=" + salaire +
                '}';
    }
}
