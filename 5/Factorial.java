import java.util.*;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n, i, j, factorial, sum=0;

        System.out.println("Please enter a number: ");
        n = console.nextInt();

        for (i=1; i<=n; i+=2) {

            factorial = 1;
            
            for (j=i; j<=i; j++) {
                factorial += j;
            }

            sum += factorial;
        }
        System.out.println("sum = "+sum);
    }
}
