import java.util.*;

public class PhoneCost {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double callMinutes = 0;
        double totalCost = 0;

        System.out.println("Please enter the call length in minutes: ");
        callMinutes = console.nextDouble();

        while (callMinutes > 0) {

            double connectFee = 2.00;
            double firstThree = 1.20;
            double additionalMinute = 0.25;

            if (callMinutes <= 3) {
                totalCost = connectFee + callMinutes*firstThree;
            }
            else {
                callMinutes = callMinutes-3;
                totalCost = connectFee + (3*firstThree) + (callMinutes*additionalMinute);
            }
            break;

        }
        
        System.out.println("The total cost is $"+totalCost);
    
    }
}
