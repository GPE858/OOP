package collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array= new ArrayList();

        array.add(7);
        array.add(986);
        array.add(5998);
        array.add(9874);
        array.add(954);

        for (int i=0;i<array.size();i++){
            System.out.println(array.get(i) +" ");
        }

        ArrayList<String> carModel = new ArrayList();
        carModel.add("Audi");
        carModel.add("BMW");
        carModel.add("VW");
        carModel.add("Ford");

        for (int i=0;i<carModel.size();i=i+1){
            System.out.println(carModel.get(i)+" ");
        }
        int count=0;
        for (int i=0;i<carModel.size();i=i+1){

            if(carModel.get(i).equals("VW")){
                count=count+1;
            }

        }System.out.println("VW is " + count);

    }

}
