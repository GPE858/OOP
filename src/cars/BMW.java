package cars;

public class BMW extends Cars{

    private boolean isDisel;

    public BMW (String modelName, int dataAge, boolean isDisel){
        super(modelName,dataAge);
        this.isDisel=isDisel;
    }
}
