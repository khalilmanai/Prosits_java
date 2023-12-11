public class Main{
    
    public static void main(String[] args){


         Etudiant st1 = new Etudiant(11 , "khalilo" , "manai" , 12.5f);
        Etudiant st2 = new Etudiant(12, "khalil" , "manai" , 12.5f);
        Etudiant st3 = new Etudiant(2, "khali&l" , "mana&i" , 12.5f);

        Etudiant[] list = new Etudiant[500];
      Ecole ecole = new Ecole(list);
     ecole.ajouterEtudiant(st1);
        ecole.ajouterEtudiant(st1);
        ecole.ajouterEtudiant(st2);
        ecole.ajouterEtudiant(st1);
        ecole.ajouterEtudiant(st3);

        System.out.println(ecole);

        System.out.println(ecole.rechercheEtudiant(st3));



    }

}