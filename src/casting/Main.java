package casting;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Model model1 = new Model("Olga","Borisova",
                        169,true);
        Model model2 = new Model("Pavel", "Golub",
                181,true);
        Model model3 = new Model("Alex","Budslav",177,false);

        Admin admin = new Admin();

        Model[] models = new Model[3];

        models[0]=model1;
        models[1]=model2;
        models[2]=model3;

        admin.checkModel(models);

        ArrayList<Model> models1 =new ArrayList();
        models1.add(model1);
        models1.add(model2);
        models1.add(model3);

        admin.checkModel1(models1);
    }


}
