public class BobaGuys {
    public static void main(String[] args) {

        //instantiate objects
        Tea tea = new Tea();
        Frescas fresca = new Frescas();
        MilkTeas milktea = new MilkTeas();


        //print default values
        System.out.println(tea);
        System.out.println();
        System.out.println(fresca);
        System.out.println();
        System.out.println(milktea);

        //change some values using mutator methods
        tea.setType("Matcha");
        fresca.setPrice(5.59);
        milktea.setBoba(true);

        fresca.setFruit("Lychee");
        milktea.setMilk("Oat Milk");

        //print updated values
        System.out.println("\nUpdated Order:");
        System.out.println(tea);
        System.out.println();
        System.out.println(fresca);
        System.out.println();
        System.out.println(milktea);
    }
}