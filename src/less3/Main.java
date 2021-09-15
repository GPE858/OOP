package less3;

public class Main {
    public static void main(String[] args) {
        Candidat candidat1 = new Candidat("Pavel", "Golubec",
                31, true);
        Candidat candidate2 = new Candidat("Jonny", "Tedesky", 35, false);

        String firstName = candidat1.getfirstName();
        System.out.println(firstName);

        String lastName = candidat1.getLastName();
        System.out.println(lastName);

        candidat1.setAge(32);
        System.out.println(candidat1.getAge());

        AAa admin = new AAa();
        admin.checkByLetter(candidate2, "o");

        admin.checkClient(candidat1);

    }
}
