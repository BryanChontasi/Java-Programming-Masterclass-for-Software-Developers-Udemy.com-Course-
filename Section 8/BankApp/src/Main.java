public class Main {
    public static void main(String[] args) {
        /*
            * Please see description of this task in the README.MD in Github
        *
        *  Bryan Chontasi 17/12/2020
        * */

        //test all the classes and methods required by description:
        System.out.println("----Test of the app description----");
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        //My own test
        System.out.println("---------------------------------------");
        System.out.println("----Test made by me----");

        //create Bank
        Bank bank2 = new Bank("UK Bank");

        //create first branch
        bank2.addBranch("Barclays");
        bank2.addCustomer("Barclays", "Bryan", 100);
        bank2.addCustomer("Barclays", "Oscar", 75.34);
        bank2.addCustomer("Barclays", "Gloria", 240.98);
        //create second branch
        bank2.addBranch("HSBC");
        bank2.addCustomer("HSBC", "Erika", 34.59);
        bank2.addCustomer("HSBC", "Diana", 43.53);
        bank2.addCustomer("HSBC", "Geoco", 54.59);

        //add some transactions
        bank2.addCustomerTransaction("Barclays", "Bryan", 34.05);
        bank2.addCustomerTransaction("Barclays", "Bryan", 134.05);
        bank2.addCustomerTransaction("HSBC", "Diana", 100);

        bank2.listCustomers("Barclays",true);
        System.out.println("-------------------------");
        bank2.listCustomers("HSBC",true);

        System.out.println("-------------------------");
        System.out.println("---------TESTS-----------");

        //Tests
        if(!bank2.addCustomer("Santander", "Diana", 80)){
            System.out.println("Error Santander branch does not exist");
        }
        if(!bank2.addBranch("HSBC")){
            System.out.println("HSBC already exists");
        }
        if(!bank2.addCustomerTransaction("Barclays", "German", 80)){
            System.out.println("Customer German does not exist at branch");
        }
        if(!bank2.addCustomer("Barclays", "Bryan", 80)){
            System.out.println("Customer Bryan already exists");
        }
    }
}
