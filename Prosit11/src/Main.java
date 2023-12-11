
public class Main {
    public static void main(String[] args) {

         AffectationHashMap af = new AffectationHashMap();
         Employee  e = new Employee(1,"alex" , "dex" , "dept" , 4);
         Departement d = new Departement(1,"dept" , 4);
        Employee  e1 = new Employee(2,"ali" , "xax" , "dept" , 4);
        Departement d1 = new Departement(3,"dept" , 4);
         af.ajouterEmployeeDepartement(e , d);
         af.ajouterEmployeeDepartement(e1 ,d1);
         af.afficherEmployees();
         af.rechercheEmployee(e);
    }
}