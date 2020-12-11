public class HealthyBurger extends Hamburger{

    //create two extras for healthy burger
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    //allow to insert the meat and price
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    //name and price of the 2 additions
    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    //override method from Hamburger class to work with the price of the burger
    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
