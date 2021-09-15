package les1;

public class CofeMashine {

    String brendName;

    public CofeMashine(String brendName){
        this.brendName= brendName;
    }
    public void brewcofe(boolean filter,boolean water, int size){
    if (filter==false){
        System.out.println("Clean up filter");

    } else
    if (water==false){
            System.out.println("Add water");
        }else {
            System.out.println("Caffe is brewing");
        }
            System.out.println("Done. Take your caffe "+ "size "+
                    size);
    }
}
