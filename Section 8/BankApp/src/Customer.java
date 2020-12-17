import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {  //initial amount to store in the array required when open account
        this.name = name;

        //to initialize transactions create array and use the method.
        this.transactions = new ArrayList<Double>(); //to i
        addTransaction(initialAmount);

    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
     //   System.out.println();
    }

    //create getters
    public String getName() {
        return name;
    }
}
