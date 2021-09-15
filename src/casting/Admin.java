package casting;

import java.util.ArrayList;

public class Admin {
    public void checkModel(Model[] array){
        for (int i =0;i<array.length;i++){
            if (array[i].getIsId()==true & array[i].getHeight()>175){
                System.out.println(array[i].getFirstName()+array[i].getLastName()+" Welcome");
            } else System.out.println(array[i].getFirstName()+array[i].getLastName()+" You were not be selected");
        }
         }



    public void checkModel1(ArrayList<Model> array){
        for (int i =0;i<array.size();i++){
            if (array.get(i).getIsId()==true & array.get(i).getHeight()>175){
                System.out.println(array.get(i).getFirstName()+array.get(i).getLastName()+" Welcome");
            } else System.out.println(array.get(i).getFirstName()+array.get(i).getLastName()+" You were not be selected");
        }
}}
