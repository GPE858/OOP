package cars;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BMW bmw = new BMW("bmw",520,true);



      BMW[] bmws = new BMW[1];
      bmws[0]=bmw;

      ArrayList<BMW> bmwsList = new ArrayList<>();
      bmwsList.add(0,bmw);






    }


}
