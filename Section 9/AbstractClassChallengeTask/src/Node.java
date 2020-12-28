/**
 * @author Bryan Chontasi
 * @created 28/12/2020 -  00:36
 * @project AbstractClassChallengeTask
 */
public class Node extends ListItem{
    //constructor created automatically
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return leftLink;
    }

    @Override
    int CompareTo(ListItem item) {
        if (item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }else {
            return -1;
        }
    }
}
