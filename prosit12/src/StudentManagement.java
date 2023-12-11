import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
public class StudentManagement implements Management {

    @Override
    public void displayEtudiants(List<Etudiant> Etudiants, Consumer<Etudiant> con) {
        for (Etudiant etudiant : Etudiants) {
            con.accept(etudiant);
        }
    }

    @Override
    public void displayEtudiantsByFilter(List<Etudiant> Etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for (Etudiant etudiant : Etudiants) {
            if (pre.test(etudiant)) {
                con.accept(etudiant);
            }
        }
    }

    @Override
    public String returnEtudiantsNames(List<Etudiant> Etudiants, Function<Etudiant, String> fun) {
       String names = "";
        for (Etudiant etudiant : Etudiants) {
         names += fun.apply(etudiant);
        }
        return names ;
    }

    @Override
    public Etudiant createEtudiant(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortEtudiantsById(List<Etudiant> Etudiants, Comparator<Etudiant> com) {
        Collections.sort(Etudiants ,com);
        return Etudiants;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> Etudiants) {
        return Etudiants.stream();
    }
}