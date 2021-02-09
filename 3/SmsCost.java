/* SMS cost calculator */

import java.util.*;

public class SmsCost 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int count;
        double cost;

        System.out.print("Input number of messages: ");
        count = console.nextInt();
        cost = 10 + 0.22*count;
        if (cost > 50)
        {
            cost = cost*0.95;
            System.out.print("You recieved a 5% discount \n");
        }
        else
        {
            cost = cost*0.98;
            System.out.print("You recieved a 2% discount \n");           
        }

        System.out.print("The total cost is "+cost+"\n");
    }
}