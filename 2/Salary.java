/*  Week 2 - Exercise 1a; 1b; 1c solutions 
    Salary.java
    *Program to calculate weekly salary from total number of hours worked
    *Modified to include base salary of 200 dollars per week.
*/

import java.util.*;

public class Salary
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        double base, normal, extra, total;
        base = 200;
        System.out.println("The base salary is: " + base);
        System.out.println("Please Enter number of normal hours: ");
        normal = console.nextDouble();
        System.out.println("Please Enter number of extra hours: ");
        extra = console.nextDouble();
        total = base+10*normal+15*extra;
        System.out.println("The total salary is: "+total+"\n");
    }
}
