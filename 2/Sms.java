/*  Week 2 - Exercise 2.3
    SMS cost calculator
*/

import java.util.*;

public class Sms
{
    public static void main(String[] args) {

        int messageNum = 100;
        double messageCost = 0.22;
        int setupCost = 265;

        double totalCost = setupCost + (messageNum * messageCost);

        System.out.print("The total SMS cost is "+totalCost+"\n");
    }
}