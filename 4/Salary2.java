/*  Tem Cavanagh;    C3366477;     18/02/2021 */


import java.util.*;

public class Salary2 {

    public static void main (String[] args) {

        Scanner console = new Scanner(System.in);
        double weeklySalary = 0; 
        double totalSalary = 0;
        double totalHours = 0;
        double hourlyRate = 10;
        double bonus = 0;

        String name;
        System.out.println("Please enter employee name: ");
        name = console.next();

        int week = 1;
        int numWeek;
        System.out.println("Please enter the number of weeks: ");
        numWeek = console.nextInt();
        
        while (week <= numWeek) {

            double weeklyHours = 0;
            String weekString = "";

            switch (week) {
                case 1 : weekString = "Week 1"; break;
                case 2 : weekString = "Week 2"; break;
                case 3 : weekString = "Week 3"; break;
                case 4 : weekString = "Week 4"; break;
                case 5 : weekString = "Week 5"; break;
                default: weekString = "extra week"; break;
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

        while (totalSalary != 0) {
            // fringe case salary=1000 exactly. how to fix?
            if (totalSalary <= 1000) {
                bonus = 10;
                totalSalary = totalSalary * (1+(1/bonus));
            }
            if (totalSalary > 1000 && totalSalary <= 2000) {
                bonus = 5;
                totalSalary = totalSalary * (1+(1/bonus));
            }
            else if (totalSalary > 2000 && totalSalary <= 3000) {
                bonus = 1;
                totalSalary = totalSalary * (1+(1/bonus));
            }
            break;
        }
        
        System.out.println();
        System.out.println("Total salary of " + name + " for " + totalHours + " hours worked is $" + totalSalary + "\n");
        System.out.println("This includes a bonus of " + bonus + "%\n");


    }
}
