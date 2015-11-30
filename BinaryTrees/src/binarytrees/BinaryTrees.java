package binarytrees;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 08/04/14
 *
 * @author jonathan
 * 
 * A la mierda!!
 */
public class BinaryTrees {

    public static void main(String[] args) {
        ArrayList<String> trees = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int x, caso = 0;
        int regs = sc.nextInt();

        for (x = 0; x < regs; x++) {
            trees.add(sc.next());
        }

        for (String tree : trees) {
            System.out.println("Caso: " + (++caso));
            for (int order = 0; order < 3; order++) {
                String tr = tree;

                while (tr.contains("(")) {
                    String conj[] = subTree(tr);
                    String remp = conj[0] + "(" + conj[1] + "," + conj[2] + ")";
                    System.out.println("si");
                    switch (order) {
                        case 0:
                            //tr = preOrder(conj);
                            tr.replace(remp, preOrder(conj));
                            break;
                        case 1:
                            //tr = postOrder(conj);
                            tr.replace(remp, postOrder(conj));
                            break;
                        case 2:
                            //tr = inOrder(conj);
                            tr.replace(remp, inOrder(conj));
                            break;
                    }
                }
                System.out.println(tr);
            }
        }

    }

    public static String preOrder(String str[]) {
        return str[0] + str[1] + str[2];
    }

    public static String postOrder(String str[]) {
        return str[1] + str[2] + str[0];
    }

    public static String inOrder(String str[]) {
        return str[1] + str[0] + str[2];
    }

    // retorna el último subárbol
    public static String[] subTree(String str) {
        String nodos[] = new String[3];
        int x, pa1 = 0, pa2 = 0;

        for (x = 0; x < str.length(); x++) {
            if ((str.charAt(x) + "").equals("(")) {
                pa1 = x;
            }
        }
        pa2 = pa1;
        while (!(str.charAt(++pa2) + "").equals(")"));

        nodos[0] = str.charAt(pa1 - 1) + "";
        String subStr = str.substring(pa1 + 1, pa2);
        nodos[1] = subStr.split(",")[0];
        nodos[2] = subStr.split(",")[1];

        return nodos;
    }
}
