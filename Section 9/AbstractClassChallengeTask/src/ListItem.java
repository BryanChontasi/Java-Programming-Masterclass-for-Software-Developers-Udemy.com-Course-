/**
 * @author Bryan Chontasi
 * @created 28/12/2020 -  00:21
 * @project AbstractClassChallengeTask
 */
public abstract class ListItem {
    //creating instances of this same class within a class
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    //creating an object value to try to be as flexible as possible
    //when defining the type of this value
    protected Object value;

    //constructor for Object
    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    // CompareTo() method
    abstract int CompareTo(ListItem item);

    //getter and setter for value
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
