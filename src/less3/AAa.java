package less3;

public class AAa {

public void checkClient (Candidat can1){

  if(can1.getAge()>21)
  {System.out.println("Welcome");}
  else{System.out.println("Go home");}
}

  public void checkByLetter(Candidat can1,String letter){
        if (can1.getLastName().indexOf(letter) ==1){
            System.out.println("Welcome");} else {
      System.out.println("Go home");}
}
}