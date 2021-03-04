/*  Tem Cavanagh;    C3366477;     03/03/2021 */

import java.util.*;
import javax.swing.*;

public class AgencyInterface {

    public static int inputAge() {

        int ageInput;
        
        ageInput = Integer.parseInt(JOptionPane.showInputDialog("Input age: "));
        while (ageInput < 18) {
            ageInput = Integer.parseInt(JOptionPane.showInputDialog("Age cannot be under 18. Please re-enter: "));
        }
        return ageInput;
    }

    public static void main (String[] args) {

       Couple c = new Couple();
       int      age, ageInput, end;
       String   name;
       
       do {
           name = JOptionPane.showInputDialog("First person name: ");
           ageInput = inputAge();              
           age = ageInput;                       
           c.addData(1,name,age);                

           name = JOptionPane.showInputDialog("Second person name: ");
           ageInput = inputAge();
           age = ageInput;                         
           c.addData(2,name,age);    
           
           JOptionPane.showMessageDialog(null, c.printCouple());
           JOptionPane.showMessageDialog(null, c.test());               
           end = Integer.parseInt(JOptionPane.showInputDialog("Quit? (0)yes (1)no: "));
        }
       while (end!=0);
    }

}