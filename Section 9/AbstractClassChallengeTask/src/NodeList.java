/**
 * @author Bryan Chontasi
 * @created 28/12/2020 -  00:48
 * @project AbstractClassChallengeTask
 */
public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);

}
