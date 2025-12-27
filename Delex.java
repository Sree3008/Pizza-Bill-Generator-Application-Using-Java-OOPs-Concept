public class Delex extends Pizza{
    public Delex(boolean veg){
        super(veg);
        System.out.println("This is the Delex pizza");
        super.addextracheese();
        super.addextratoppings();
    }
    @Override
    public void addextracheese(){}
    @Override
    public void addextratoppings(){}
    @Override
public void getbill() {
    System.out.println("Final Bill for Your Ordered Deluxe Pizza");

    if (veg) {
        System.out.println("Veg Deluxe Pizza");
    } else {
        System.out.println("Non-Veg Deluxe Pizza");
    }
    System.out.println("Total Bill : " +price);
}
}
