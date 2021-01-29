import java.util.*; // import all utility libraries


public class Test_02 //name of your class
{
 
  public static void main(String[] args) 
  {

	Scanner keyboard = new Scanner(System.in); //keyboard input
	double mathsMark, physicsMark, drawingMark, totalMark;
	
	
	System.out.print("My Maths mark is (/15): ");
	mathsMark = keyboard.nextDouble();
	
	System.out.print("My Physics mark is (/15): ");
	physicsMark = keyboard.nextDouble();
	
	System.out.print("My drawing mark is (/15): ");
	drawingMark = keyboard.nextDouble();
	
	totalMark = mathsMark + physicsMark + drawingMark;
	
	
	System.out.print("Total mark: " + totalMark + "\n");

    if (totalMark >= 20)
	  System.out.print("I pass the entry test.\n");
    else
    {
	  System.out.print("I will try one more time.\n");
	  System.out.print("Fail....\n\n");
    }
  }
}




