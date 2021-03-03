public class Person {
    private String name;
     int age;

    //--------------------------------------------------------------------------------------  
    // constructor method
    //--------------------------------------------------------------------------------------
    
    public Person() {
        name = "";
        age = 0;
    }

    public Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    //--------------------------------------------------------------------------------------    
    public void setName(String newName) {
        name = newName;
    }
    
    //--------------------------------------------------------------------------------------    
    public String getName() {
        return name;
    }
    
    //--------------------------------------------------------------------------------------    
    public void setAge(int newAge) {
        age = newAge;
    }
    
    //--------------------------------------------------------------------------------------
    public int getAge() {
        return age;
    }
    
}