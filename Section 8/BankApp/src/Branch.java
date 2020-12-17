import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;  //each branch should have an arraylist of customers

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    //getter for the name

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){ // use of boolean to tst if customer already exists(true or false)
        if(findCustomer(customerName) == null ){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        //if already exists
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer =  findCustomer(customerName);
    //    if(findCustomer(customerName) != null ){
        if(existingCustomer != null){  //if customer is on file
            existingCustomer.addTransaction(amount); //addTransaction from customer class
                return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i < this.customers.size(); i++){
//            if(this.customers.get(i).getName().equals(customerName)){ //getName() From customer class
//               return this.customers.get(i);
            //------------------  if customer is
            Customer checkCustomer = this.customers.get(i);
            if (checkCustomer.getName().equals(customerName)){
                return checkCustomer;
            }
        }
        //if not name is equal return null
        return  null;
    }
}
