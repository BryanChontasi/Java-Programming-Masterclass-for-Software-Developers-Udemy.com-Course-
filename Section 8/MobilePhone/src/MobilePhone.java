import java.util.ArrayList;

public class MobilePhone {

    private String myNumber; //option to store a number

    private ArrayList<Contact> myContacts; //array list created

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0) {  //if l
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact); //get index position using findContact method
        if (foundPosition < 0){ // les than 0 is not found
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name "+ newContact.getName() +
                    " already exists, Update was not successful");
            return false;
        }
        this.myContacts.set(foundPosition, newContact); //seth method from Arraylist class(index, new element)
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact); //get index position using findContact method
        if (foundPosition < 0){ // les than 0 is not found
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition); //remove(index) from array list methods
        System.out.println(contact.getName()+ ", was deleted");
        return true;
    }


    //two findContact methods, first return int
    // 0 or grater if contact already exists
    // or less than 0 if it does not exists
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName){
        for (int i=0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i); // create new object
            if(contact.getName().equals(contactName)){ //getName from contact record equals to contact name passed
                return i;
            }
        }
        return -1;
    }
//    public String queryContact( Contact contact){ //this is like the third version of findContact, returning as string the name
//        if (findContact(contact) >= 0){
//            return contact.getName();
//        }
//        return null;
//    }
    public Contact queryContact( String name){
        int position = findContact(name); //find position in index using findContact(String)
        if(position >=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    //print new contacts
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " -> "
                    + this.myContacts.get(i).getPhoneNumber()); //get(i) works because of Contacts array type
        }
    }
}
