package clinic;

public class VetClinic {

    public void vakcineshion (Cat cat){
      if (cat.getAge()>=2){System.out.println("Hi "+ cat.getName() +" you need vaccine!");}
      else {System.out.println("Go home");}

    }

}
