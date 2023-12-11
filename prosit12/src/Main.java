import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Etudiant> studentList = new ArrayList<>();

        studentList.add(new Etudiant(1,"khalil" , 20));
        studentList.add(new Etudiant(2,"khalil1" , 21));
        studentList.add(new Etudiant(3,"khalil2" , 22));

     StudentManagement stm = new StudentManagement();

     stm.displayEtudiants(studentList , student-> System.out.println(student));
     stm.displayEtudiantsByFilter(studentList , (student) -> student.getAge() > 18, System.out::println);
    }
}