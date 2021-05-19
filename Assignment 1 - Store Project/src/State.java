/*
Assignment 1 SENG6110

Name:               Tem Cavanagh
Student number:     c3366477
Course:             SENG6110
Assignment:         1
Date:               21/03/2021
*/

public class State {
    
    // Attributes -----------------------------------------
    private Store redfern, glebe, newtown;
    
    // Constructor / Add Stores ---------------------------
    public State(Store redfern, Store glebe, Store newtown) {
        this.redfern = redfern;
        this.glebe = glebe;
        this.newtown = newtown;
    }

    // Display method -------------------------------------
    public String displayState() {
        return redfern.storeDetails()+'\n'+glebe.storeDetails()+'\n'+newtown.storeDetails();
    }

}

