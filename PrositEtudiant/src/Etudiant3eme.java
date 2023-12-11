public class Etudiant3eme extends Etudiant{

    private String branche;
    public Etudiant3eme(int identifiant, String nom, String prenom, float moyenne , String branche) {
        super(identifiant, nom, prenom, moyenne);
       this.branche = branche;
    }

    @Override
    void ajouterUneAbsence() {
        this.setMoyenne(getMoyenne() - 0.5f);
    }
}
