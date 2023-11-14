public class MilkTeas extends Tea {
    // instance variable for class
    private String milk;
    //default values
    public MilkTeas() {
        this("Brown Sugar", 4.99, false, "Whole Milk");
    }
    //inherit attributes from superclass
    public MilkTeas(String type, double price, boolean boba, String milk) {
        //uses super to access the instance variables from the super class frozenfood
        super(type, price, boba);
        this.milk = milk;
    }
    //accessor method
    public String getMilk() {
        return milk;
    }
    //mutator method
    public void setMilk(String newMilk) {
        milk = newMilk;
    }
    //toString method
    public String toString() {
        return super.toString() + "\nMilk: " + getMilk();
    }
}