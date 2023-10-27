package week4;

public class mainThree {
    public static void main(String[] args) {
        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println("Salary: " + pekka.getSalary() + " euros per month");
        System.out.println( esko );
        System.out.println("Salary: " + esko.getSalary() + " euros per month");


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );
        System.out.println("Credits: " + olli.getCredits());
    }
}
