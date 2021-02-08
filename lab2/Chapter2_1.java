/* Simple interest calulcator */

import java.util.*;

public class Chapter2_1 
{

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); 

        double principal, rate, years, amount;

        System.out.println("Enter the principal amount: ");
        principal = console.nextDouble();

        System.out.println("Enter the interest rate as a decimal: ");
        rate = console.nextDouble();

        System.out.println("Enter the loan duration in years: ");
        years = console.nextDouble();

        amount = principal*((1+rate)*years);
        System.out.println("The total loan amount is "+amount);

    }
}