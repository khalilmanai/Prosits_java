import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Ecole {

    Etudiant[] ListeEtudiant = new Etudiant[500];


    public Ecole(Etudiant[] listeEtudiant) {
        ListeEtudiant = listeEtudiant;
    }

    public void ajouterEtudiant(Etudiant E) {
        for (int i = 0; i < ListeEtudiant.length; i++) {
            if (ListeEtudiant[i] == null) {
                ListeEtudiant[i] = E;
break;
            }
        }
        System.out.println("List is already full. Cannot add more students.");
    }



int rechercheEtudiant(Etudiant E){
  for(int i= 0; i < ListeEtudiant.length ; i++) {
      if(ListeEtudiant[i].equals(E)){
          return i;
      }
  }
return -1;
}




    @Override
    public String toString() {
        return "Ecole{" +
                "ListeEtudiant=" + Arrays.toString(ListeEtudiant) +
                '}';
    }
}


