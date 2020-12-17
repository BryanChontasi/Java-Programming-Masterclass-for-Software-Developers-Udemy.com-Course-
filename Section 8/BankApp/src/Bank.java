import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;  //arraylist, a bank can have multiple branches

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

     public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName); //to check in next if
        if(branch != null){  //if branch name is not found, return te new customer in the branch array
            return  branch.newCustomer(customerName, initialAmount);
        }
        return false;
     }

     public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
         }
        return  false;
     }
    private Branch findBranch(String branchName){
        for(int i = 0; i < this.branches.size(); i++){
//            if(this.customers.get(i).getName().equals(customerName)){ //getName() From customer class
//               return this.customers.get(i);
            //------------------  if customer is
            Branch checBranch = this.branches.get(i);
            if (checBranch.getName().equals(branchName)){
                return checBranch;
            }
        }
        //if not name is equal return null
        return  null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch "+ branch.getName());;

            ArrayList<Customer> branchCustomers = branch.getCustomers() ;

            for (int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);  //list of customers from the branch we are looking for
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+ 1) +"]");
                if(showTransactions){ //if show transactions is true
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();

                    for(int j = 0; j< transactions.size(); j++ ){
                        String toString = String.format("%,.2f", transactions.get(j));
                        System.out.println("[" + (j+1)+ "]  Amount "+ toString );

                    }
                }
            }
            return  true;
        }else{
            return false;
        }
    }
}
