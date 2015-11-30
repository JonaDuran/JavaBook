package linked_list;

import java.util.LinkedList;

/**
 * 29/03/14
 *
 * @author jonathan
 */
public class Linked_List {

    public static void main(String[] args) {
        int x;
        LinkedList<String> link = new LinkedList<String>();

        for (x = 0; x < 5; x++) {
            if (x % 2 == 0) {
                link.addFirst("par" + x);
            } else {
                link.addLast("non" + x);
            }
        }
        System.out.println(link.toString());

        link.removeFirst();
        link.removeLast();
        link.offerFirst("par10");
        link.offerLast("non11");
        System.out.println(link.toString());
    }

}
