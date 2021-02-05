/*  Week 2 - Exercise 3
    Employee salary calculator
*/

import java.util.*;

public class WeeklySalary
{
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double salary2017, increment2018, newSalary, weeklySalary;
        String firstName, lastName;

        System.out.println("Please enter your first name: ");
        firstName = console.next();
        System.out.println("Please enter your last name: ");
        lastName = console.next();
        System.out.println("Please enter your salary in 2017: ");
        salary2017 = console.nextDouble();
        System.out.println("Please enter your salary increment perecentage for 2018: ");
        increment2018 = console.nextDouble();
        increment2018 = increment2018/100;

        newSalary = Math.round(salary2017*(1+increment2018));
        weeklySalary = Math.round(newSalary/52);

        System.out.print("The new salary for "+ firstName + " " + lastName);
        System.out.println(" in 2018 is $"+newSalary+" and the weekly salary is $"+weeklySalary+"\n");
    }
}