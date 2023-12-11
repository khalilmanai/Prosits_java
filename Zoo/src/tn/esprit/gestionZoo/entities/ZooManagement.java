package tn.esprit.gestionZoo.entities;

import java.util.*;

public class ZooManagement {
    private Scanner scanner = new Scanner(System.in);
    private int nbrCages;
    private String zooName;

    public ZooManagement() {
        // Constructor
        System.out.print("Entrez le nombre de cages : ");
        nbrCages = 0;

        if (scanner.hasNextInt()) {
            nbrCages = scanner.nextInt();
        } else {
            System.out.println("Nombre de cages invalide. Utilisation de la valeur par défaut (20).");
        }
        scanner.nextLine(); // Pour consommer la ligne restante

        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();
    }

    public void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }


}
