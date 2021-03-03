public class Couple {

    final private int MAX = 5;
    private Person p1, p2;
    private int total;

    //--------------------------------------------------------------------------------------
    public Couple() {
        p1  = new Person();
        p2 = new Person();
        // total = 0;
    }

    //--------------------------------------------------------------------------------------
    public void addData(int option, String newName, int newAge) {
        if (option==1)  setData1(p1, newName, newAge);
        else            setData1(p2, newName, newAge);
    }

    private void setData1(Person p, String name, int age) {
        p.setName(name);
        p.setAge(age);
    }

    //--------------------------------------------------------------------------------------    
    public String test() {
        if (p1.getAge() < p2.getAge())  return("GOOD FOR "+p2.getName()+"!");
        else                            return("GOOD FOR "+p1.getName()+"!");
    }

    public String display() {
        return("p1: "+p1.getName()+","+p1.getAge()+"\np2:"+p2.getName()+","+p2.getAge());
    }

}