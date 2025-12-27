public class Main{
    public static void main(String[] args){
        // for basic veg pizza
        System.out.println();
        Pizza basePizza=new Pizza(true);
        basePizza.addextracheese();
        basePizza.addextratoppings();
        basePizza.takeaway();
        basePizza.getbill();
        System.out.println();
        // for basic non veg pizza
        Pizza basePizza1=new Pizza(false);
        basePizza1.addextracheese();
        basePizza1.addextratoppings();
        basePizza1.takeaway();
        basePizza1.getbill();

        //for delex veg pizza
        System.out.println();
        Delex dp=new Delex(true);
        dp.getbill();

        //for delex non veg pizza
        System.out.println();
        Delex dp1=new Delex(false);
        dp1.getbill();
    }
}

