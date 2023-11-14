public class Frescas extends Tea {
    //instance variable for class
    private String fruit;

    //default values
    public Frescas() {
        this("Oolong", 6.93, true, "Strawberry");
    }

    //inherit attributes from superclass
    public Frescas(String type, double price, boolean boba, String fruit) {
        super(type, price, boba);
        this.fruit = fruit;
    }

    //accessor method
    public String getFruit() {
        return fruit;
    }

    //mutator method
    public void setFruit(String newFruit) {
        fruit = newFruit;
    }

    //toString method
    public String toString() {
        return super.toString() + "\nFruit: " + getFruit();
    }
}