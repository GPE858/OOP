package collections;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList();

     cars.add("Mazda");
     cars.add("Ford");
     cars.add("Opel");

     cars.set(0,"VW");

     cars.indexOf("Ford");
     cars.remove("Opel ");
     boolean isVw = cars.contains("VW");

        System.out.println(isVw);



     for (int i=0;i<cars.size();i++){
         System.out.println(cars.get(i));
     }
    }
}
