public class Pizza{
    protected int price;
    protected boolean veg;
    private int extracheesePrice=100;
    private int extratoppingsPrice=150;
    private int takeAwayprice=20;
    private boolean extracheese=false;
    private boolean extratoopings=false;
    private boolean takeaway=false;
    private int basepizzaprice;
    public Pizza(boolean veg){
        this.veg=veg;
        if(veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basepizzaprice=this.price;
    }
    public void addextratoppings(){
        this.price+=extratoppingsPrice;
        extratoopings=true;
    }
    public void addextracheese(){
        this.price+=extracheesePrice;
        extracheese = true;
    }
    public void takeaway(){
        this.price+=takeAwayprice;
        takeaway=true;
    }
    public void getbill(){
        System.out.println("Final Bill for Your Ordered Pizza");
        System.out.println("Pizza : "+basepizzaprice);
         if (veg) {
            System.out.println("Veg Pizza");
        } else {
            System.out.println("Non-Veg Pizza");
        }
        if(extracheese){
            System.out.println("Extra cheese added : "+extracheesePrice);
        }
        if(extratoopings){
            System.out.println("Extra Toppings Added : "+extratoppingsPrice);
        }
        if(takeaway){
            System.out.println("Takeaway Added : "+takeAwayprice);
        }
        System.out.println("Total Bill : "+this.price);
    }

}