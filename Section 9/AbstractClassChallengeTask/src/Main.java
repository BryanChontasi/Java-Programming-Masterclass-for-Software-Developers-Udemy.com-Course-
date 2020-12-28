/**
 * @author Bryan Chontasi on 28/12/2020.
 * @project AbstractClassChallengeTask
 */
public class Main {
    public static void main(String[] args) {

        //Please read the Challenge Description in the README.md file uploaded in Github





        MyLinkedList list = new MyLinkedList(null); // using linkedList

        SearchTree tree = new SearchTree(null); //using SearchTree
        tree.traverse(tree.getRoot());

        // Create a string data array to avoid typing loads of addItem instructions:
//      String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the strings
            tree.addItem(new Node(s));
//            list.addItem(new Node(s));
        }

        System.out.println("Testing MyLinkedList ================:");
        list.traverse(list.getRoot());

        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());

        list.removeItem((list.getRoot()));
        list.traverse(list.getRoot());
        list.removeItem((list.getRoot()));
        list.traverse(list.getRoot());

        System.out.println("\nTesting SearchTree (binary tree) ================:");


        tree.traverse(tree.getRoot());

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());

        tree.removeItem((tree.getRoot()));
        tree.traverse(tree.getRoot());
        tree.removeItem((tree.getRoot()));
        tree.traverse(tree.getRoot());

    }
}
