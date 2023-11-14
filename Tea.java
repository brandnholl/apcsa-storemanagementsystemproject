public class Tea {
    //superclass of all boba guys drinks
    private String type;
    private double price;
    private boolean boba;

    //default values
    public Tea() {
        this("Earl Grey", 5.35, false);
    }

    //instance variables
    public Tea(String type, double price, boolean boba) {
        this.type = type;
        this.price = price;
        this.boba = boba;
    }

    //accessor methods
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean getBoba() {
        return boba;
    }

    //mutator methods
    public void setType(String newType) {
        type = newType;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setBoba(boolean newBoba) {
        boba = newBoba;
    }

    //toString method
    public String toString() {
        return "Type: " + getType() + "\nPrice: $" + getPrice() + "\nBoba: " + getBoba();
    }
}