package clinic;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Bonifaciy","black",2);
        VetClinic clinic = new VetClinic();
       clinic.vakcineshion(cat1);

    }
}
