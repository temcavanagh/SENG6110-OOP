import java.util.*;

public class Salary
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        double normalWk1,normalWk2,extraWk1,extraWk2,total;
        System.out.println("Please Enter number of normal hours in week 1: ");
        normalWk1 = console.nextDouble();
        System.out.println("Please Enter number of extra hours in Week 1: ");
        extraWk1 = console.nextDouble();
        System.out.println("Please Enter number of normal hours in week 2: ");
        normalWk2 = console.nextDouble();
        System.out.println("Please Enter number of extra hours in Week 2: ");
        extraWk2 = console.nextDouble();
        total = 10*(normalWk1+normalWk2)+15*(extraWk1+extraWk2);
        if (total < 500)
        {
            total = total * 1.10;
        }
        if (500 <= total && total < 1000)
        {
            total = total * 1.05;
        }
        System.out.println("Total salary is: "+total+"\n");
    }
}
