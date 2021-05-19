/*
Assignment 1 SENG6110

Name:               Tem Cavanagh
Student number:     c3366477
Course:             SENG6110
Assignment:         1
Date:               21/03/2021
*/

import java.util.*;
import javax.swing.*;

public class Interface {

  private Store redfern;
  private Store glebe;
  private Store carlton;
  private Store newtown;
  private Store sandyBay;
  private Store redcliffe;
    
  static Scanner console = new Scanner(System.in);
    
  int inputNum = 0;

  public void run() {

    // Display console menu and read input values until -1 entered:
    while(inputNum != -1) {

      System.out.println("Select an option and press ENTER:");
      System.out.println("1. Create store objects in database");
      System.out.println("2. List all store details from database");
      System.out.println("3. Delete Carlton store from database");
      System.out.println("4. Manually add Carlton store (GUI)");
      System.out.println("5. Change Redcliffe Store Manager (GUI)");
      System.out.println("6. Calculate average annual profit for Sydney stores");
      System.out.println("7. List city and manager for a given Sydney store (GUI)");
      System.out.println("8. List stores over a certain annual profit amount (GUI)");
      System.out.println("9. Display store details for stores in NSW");
      System.out.println("-1. Exit");
          
      inputNum = console.nextInt(); 
        
      switch(inputNum) {
        case  1: option01(); break;
        case  2: option02(); break;
        case  3: option03(); break;
        case  4: option04(); break;
        case  5: option05(); break;
        case  6: option06(); break;
        case  7: option07(); break;
        case  8: option08(); break;
        case  9: option09(); break;
        case -1: System.exit(0); break;
      }  // end of switch(inputNum) 
            
    } // end of while(inputNum != -1) 
        
	}  // end of run() method



  // Code for option 1 ---------------------------------------------------------
  // Create Store objects // Console Option

  public void option01() {

    System.out.println("You selected option 1 \n");                 // Show confirmation dialog

    // Create six store objects with supplied data
    redfern = new Store("Redfern","Sydney","Chan",235672);
    glebe = new Store("Glebe","Sydney","Ngo",326736);
    carlton = new Store("Carlton","Melbourne","Olios",217352);
    newtown = new Store("Newtown","Sydney","Reid",182726);
    sandyBay = new Store("Sandy Bay","Hobart","Tan",27362);
    redcliffe = new Store("Redcliffe","Brisbane","Dale",109982);

    System.out.println("Store objects have been created\n");        // Show confirmation dialog
        
  }
    

  // Code for option 2 ---------------------------------------------------------
  // Display all data // Console Option

  public void option02() {

    System.out.println("You selected option 2\n");                  // Show confirmation dialog

    // Check if carlton Store object is null and then display attributes for all Store objects 
    if (this.carlton == null) {
      System.out.println("Store Details:\n"+redfern.storeDetails()+"\n"+
                                          glebe.storeDetails()+"\n"+
                                          newtown.storeDetails()+"\n"+
                                          sandyBay.storeDetails()+"\n"+
                                          redcliffe.storeDetails()+"\n");
    } else { 
      System.out.println("Store Details:\n"+redfern.storeDetails()+"\n"+
                                          glebe.storeDetails()+"\n"+
                                          carlton.storeDetails()+"\n"+
                                          newtown.storeDetails()+"\n"+
                                          sandyBay.storeDetails()+"\n"+
                                          redcliffe.storeDetails()+"\n");
    }

  }
    


  // Code for option 3  ---------------------------------------------------------
  // Delete Carlton store // Console Option

  public void option03() {
    
    System.out.println("You selected option 3 \n");                             // Show confirmation dialog
    carlton = null;                                                             // Set carlton Store object to null
    System.out.println("Details for Carlton store have been deleted\n");        // Show confirmation dialog

  }
    


  // Code for option 4 ---------------------------------------------------------
  // ADD Carlton Store  Manually // GUI Option

  public void option04() {
    
    System.out.println("You selected Option 4\n");                             // Show confirmation dialog
    System.out.println("Please use the GUI for this option\n");                // Direct user to GUI

    carlton = new Store();                        // Create new Store object for carlton store

    // Prompt and set store details from user keyboard input
    carlton.setStoreName(JOptionPane.showInputDialog(null, "Enter Store Name:", "Add Carlton Store Details", JOptionPane.PLAIN_MESSAGE));
    carlton.setStoreCity(JOptionPane.showInputDialog(null, "Enter Store City:", "Add Carlton Store Details", JOptionPane.PLAIN_MESSAGE));
    carlton.setStoreManager(JOptionPane.showInputDialog(null, "Enter Store Manager:", "Add Carlton Store Details", JOptionPane.PLAIN_MESSAGE));
    carlton.setStoreAnnualProfit(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Store Annual Profit:", "Add Carlton Store Details", JOptionPane.PLAIN_MESSAGE)));

    // Display the values added for all attributes of this store
    JOptionPane.showMessageDialog(null,"The following store details were added:\n"+carlton.storeDetails(), "Success", JOptionPane.PLAIN_MESSAGE);

  }



  // Code for option 5  ---------------------------------------------------------
  // Change details of Redcliffe store manager // GUI Option

  public void option05() {

    System.out.println("You selected Option 5\n");                                // Show confirmation dialog
    System.out.println("Please use the GUI for this option\n");                   // Direct user to GUI
    
    // Prompt and change manager details from keyboard input:
    redcliffe.setStoreManager(JOptionPane.showInputDialog(null, "\nEnter New Manager Name: ", "Change Redcliffe Store Manager", JOptionPane.PLAIN_MESSAGE));

    // Display the values of all attributes for this store
    JOptionPane.showMessageDialog(null, "The new Redcliffe stores details are: \n"+redcliffe.storeDetails(), "Success", JOptionPane.PLAIN_MESSAGE);
  }
    


  // Code for option 6 ---------------------------------------------------------
  // Calculate average profit for sydney stores // Console Option

  public void option06() {

    System.out.println("You selected Option 6\n");              // Show confirmation dialog

    double avgProfit = (double)(redfern.getStoreAnnualProfit()+glebe.getStoreAnnualProfit()+newtown.getStoreAnnualProfit())/3.0;       // Calculate average profit

    System.out.println("Average annual profit for Sydney stores: $"+avgProfit+"\n");      // Display calculated average profit

  }



  // Code for option 7 --------------------------------------------------------- 
  // List city and manager for a Sydney store // GUI Option

  public void option07() {

    System.out.println("You selected Option 7\n");                              // Show confirmation dialog
    System.out.println("Please use the GUI for this option\n");                 // Direct user to GUI

    // Prompt and accept user search input from keyboard:
    String storeSearch = JOptionPane.showInputDialog(null, "Please enter a Sydney store name: ", "Search", JOptionPane.PLAIN_MESSAGE);
    
    storeSearch = storeSearch.toLowerCase();                                    // Convert search string to lower case
    
    // Commence search of sydney stores and display response dialog showing store city and store manager
    if (storeSearch.equals(redfern.getStoreName().toLowerCase())) {
      JOptionPane.showMessageDialog(null, "Store city: "+redfern.getStoreCity()+",  Store manager: "+redfern.getStoreManager()+"\n", redfern.getStoreName(), JOptionPane.PLAIN_MESSAGE);
    }
    else if (storeSearch.equals(glebe.getStoreName().toLowerCase())) {
      JOptionPane.showMessageDialog(null, "Store city: "+glebe.getStoreCity()+",   Store manager: "+glebe.getStoreManager()+"\n", glebe.getStoreName(), JOptionPane.PLAIN_MESSAGE);
    }
    else if (storeSearch.equals(newtown.getStoreName().toLowerCase())) {
      JOptionPane.showMessageDialog(null, "Store city: "+newtown.getStoreCity()+",  Store manager: "+newtown.getStoreManager()+"\n", newtown.getStoreName(), JOptionPane.PLAIN_MESSAGE);
    }
    else {
      JOptionPane.showMessageDialog(null, "No store matches.", "Error", JOptionPane.PLAIN_MESSAGE);     // Show error message if no matches found
    }
  }



  // Code for option 8 --------------------------------------------------------- 
  // Search store profits over an inputted amount // GUI Option
    
  public void option08() {

    System.out.println("You selected Option 8\n");                              // Show confirmation dialog
    System.out.println("Please use the GUI for this option\n");                 // Direct user to GUI

    int profitSearch = 0;         // Search amount
    String printString = "";      // Return string of store names

    // Prompt and accept user search input from keyboard:
    profitSearch = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the minimum annual profit amount to search: ", "Search", JOptionPane.PLAIN_MESSAGE));

    // Commence search of store profit values and add store details to printString when criteria met
    if (redfern.getStoreAnnualProfit() > profitSearch) {
      printString += "\n"+redfern.getStoreName()+", "+redfern.getStoreCity();
    } 
    if (glebe.getStoreAnnualProfit() > profitSearch) {
      printString += "\n"+glebe.getStoreName()+", "+glebe.getStoreCity();
    } 
    if (carlton.getStoreAnnualProfit() > profitSearch) {
      printString += "\n"+carlton.getStoreName()+", "+carlton.getStoreCity();
    } 
    if (newtown.getStoreAnnualProfit() > profitSearch) {
      printString += "\n"+newtown.getStoreName()+", "+newtown.getStoreCity();
    } 
    if (sandyBay.getStoreAnnualProfit() > profitSearch) {
      printString += "\n"+sandyBay.getStoreName()+", "+sandyBay.getStoreCity();
    } 
    if (redcliffe.getStoreAnnualProfit() > profitSearch) {
      printString += "\n"+redcliffe.getStoreName()+", "+redcliffe.getStoreCity();
    } 

    JOptionPane.showMessageDialog(null, "Stores with annual profits over $"+profitSearch+":"+printString, "Success", JOptionPane.PLAIN_MESSAGE);  // Display stores found

  }



  // Code for option 9 --------------------------------------------------------- 
  // List NSW stores // Console Option

  public void option09() {
    
    System.out.println("You selected Option 9\n");                      // Show confirmation dialog
    State nsw = new State(redfern, glebe, newtown);                     // Create object
    System.out.println("NSW Stores: \n"+nsw.displayState()+"\n");       // Call display method from State class

  }


  // main() method to execute the code in the run() method -----------------------------------------
    
	public static void main(String[] args) {
		Interface intFace = new Interface();
		intFace.run();
	}
}

