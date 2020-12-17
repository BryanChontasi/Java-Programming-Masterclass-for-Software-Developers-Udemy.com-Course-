public class Main {
    public static void main(String[] args) {
        /*
            * Please see description of this task in the README.MD in Github
        *
        *  Bryan Chontasi 17/12/2020
        * */

        //test all the classes and methods:

        //create Bank
        Bank bank = new Bank("UK Bank");

        //create first branch
        bank.addBranch("Barclays");
        bank.addCustomer("Barclays", "Bryan", 100);
        bank.addCustomer("Barclays", "Oscar", 75.34);
        bank.addCustomer("Barclays", "Gloria", 240.98);
        //create second branch
        bank.addBranch("HSBC");
        bank.addCustomer("HSBC", "Erika", 34.59);
        bank.addCustomer("HSBC", "Diana", 43.53);
        bank.addCustomer("HSBC", "Geoco", 54.59);

        //add some transactions
        bank.addCustomerTransaction("Barclays", "Bryan", 34.05);
        bank.addCustomerTransaction("Barclays", "Bryan", 134.05);
        bank.addCustomerTransaction("HSBC", "Diana", 100);

        bank.listCustomers("Barclays",true);
        System.out.println("-------------------------");
        bank.listCustomers("HSBC",true);

        System.out.println("-------------------------");
        System.out.println("---------TESTS-----------");

        //Tests
        if(!bank.addCustomer("Santander", "Diana", 80)){
            System.out.println("Error Santander branch does not exist");
        }
        if(!bank.addBranch("HSBC")){
            System.out.println("HSBC already exists");
        }
        if(!bank.addCustomerTransaction("Barclays", "German", 80)){
            System.out.println("Customer German does not exist at branch");
        }
        if(!bank.addCustomer("Barclays", "Bryan", 80)){
            System.out.println("Customer Bryan already exists");
        }
    }
}