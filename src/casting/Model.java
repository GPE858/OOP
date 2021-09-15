package casting;

public class Model {
    private String firstName;
    private String lastName;
    private int height;
    private boolean isId;

    public Model(String firstName,String lastName,
                 int height, boolean isId){
        this.firstName=firstName;
        this.lastName=lastName;
        this.height=height;
        this.isId=isId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getHeight(){
        return height;
    }
    public boolean getIsId(){
        return isId;
    }



}

