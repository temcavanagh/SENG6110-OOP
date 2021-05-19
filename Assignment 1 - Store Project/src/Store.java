/*
Assignment 1 SENG6110

Name:               Tem Cavanagh
Student number:     c3366477
Course:             SENG6110
Assignment:         1
Date:               21/03/2021
*/

public class Store {
    
    // attributes
    private String storeName = "";     // Initialise with a null string
    private String storeCity = ""; 
    private String storeManager = "";
    private int storeAnnualProfit = 0;    
    

    // Constructor methods --------------------------------------------------

    // constructor with no parameters (Empty constructor / Sets defaults)
    public Store() {
        storeName="";
        storeCity="";
        storeManager="";
        storeAnnualProfit=0;
    }
        
    // constructor with parameters / Accepts inputs
    public Store(String newStoreName, String newStoreCity, String newStoreManager, int newStoreAnnualProfit) {
        storeName = newStoreName;
        storeCity = newStoreCity;
        storeManager = newStoreManager;
        storeAnnualProfit = newStoreAnnualProfit;
    }


    // Setter & Getter Methods ----------------------------------------------

    // storeName  -----------------------------------------------------------
    // setter method storeName
    public void setStoreName(String newStoreName) { 
        storeName = newStoreName;
    }
    // getter method storeName
    public String getStoreName() {
        return storeName;
    }

    // storeCity  -----------------------------------------------------------
    // setter method storeCity
    public void setStoreCity(String newStoreCity) { 
        storeCity = newStoreCity;
    }
    // getter method storeCity
    public String getStoreCity() {
        return storeCity;
    }

    // storeManager  --------------------------------------------------------
    // setter method storeManager
    public void setStoreManager(String newStoreManager) { 
        storeManager = newStoreManager;
    }
    // getter method storeManager
    public String getStoreManager() {
        return storeManager;
    }  

    // storeAnnualProfit  --------------------------------------------------
    // setter method storeAnnualProfit
    public void setStoreAnnualProfit(int newStoreAnnualProfit) { 
        storeAnnualProfit = newStoreAnnualProfit;
    }
    // getter method storeAnnualProfit
    public int getStoreAnnualProfit() {
        return storeAnnualProfit;
    } 

    // Display Methods -----------------------------------------------------

    // Display store details method 
    public String storeDetails() {
        return "Store name: "+getStoreName()+", City: "+getStoreCity()+", Manager: "+getStoreManager()+", Annual profit: $"+getStoreAnnualProfit();
    }

}


