package less3;

public class Candidat {
    private  String firstName;
    private String lastName;
   private int age;
   private boolean isDegree;

    public Candidat(String firstName,String lastName,
                    int age, boolean isDegree){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.isDegree=isDegree;

    }
    public String getfirstName(){
        return firstName;}

    public int getAge(){
        return age;
    }

    public void setAge(int age) {this.age=age;}

    public String getLastName(){
        return lastName; }

}

