import java.util.*;

public class AgencyInterface {

    public static int inputAge() {

        Scanner console = new Scanner(System.in);
        System.out.print("Input age: ");
        int ageInput = console.nextInt();
        while (ageInput < 18) {
            System.out.println("Age cannot be under 18. Please re-enter: ");
            ageInput = console.nextInt();
        }
        return ageInput;
    }

    public static void main (String[] args) {

       Scanner console = new Scanner(System.in);
       Couple c = new Couple();
       int      age, ageInput, end;
       String   name;
       
       do {
           System.out.print("First person: "); 
           System.out.print("Name: ");
           name = console.next();
           ageInput = inputAge();              
           age = ageInput;                       
           c.addData(1,name,age);                

           System.out.print("Second person: "); 
           System.out.print("Name: "); 
           name = console.next();
           ageInput = inputAge();
           age = ageInput;                         
           c.addData(2,name,age);              

           System.out.println("********************");
           System.out.println(c.test());                  
           System.out.println("********************");
           System.out.print("Quit? (0)yes (1)no: "); 
           end = console.nextInt();
        }

       while (end!=0);
    }

}