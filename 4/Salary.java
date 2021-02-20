/*  Tem Cavanagh;    C3366477;     18/02/2021 */


import java.util.*;

public class Salary {

    public static void main (String[] args) {

        Scanner console = new Scanner(System.in);
        
        double weeklySalary = 0; 
        double totalSalary = 0;
        double totalHours = 0;
        double hourlyRate = 10;

        int week = 1;
        
        for (int i=1; i<=5; i++) {

            double weeklyHours = 0;
            String weekString = "";

            switch (week) {
                case 1 : weekString = "Week 1"; break;
                case 2 : weekString = "Week 2"; break;
                case 3 : weekString = "Week 3"; break;
                case 4 : weekString = "Week 4"; break;
                case 5 : weekString = "Week 5"; break;
                default: weekString = "Invalid"; break;
            }

            System.out.println("Please enter total number of hours for "+weekString+": ");
            weeklyHours = console.nextDouble();

            if (weeklyHours >= 0) {

                if (weeklyHours > 40) {
                    weeklySalary = (40 * hourlyRate) + ((weeklyHours-40)*(hourlyRate*1.5));
                } 
                else if (weeklyHours <= 40) {
                    weeklySalary = weeklyHours * hourlyRate;
                }

                totalHours += weeklyHours;
                totalSalary += weeklySalary;
                week++;
            }
            
            else {
                System.out.println("Invalid input. Hours worked cannot be negative.");
            }
        }
        
        System.out.println();
        System.out.println("Total salary for " + totalHours + " hours worked is $" + totalSalary + "\n");
        
    }
}
