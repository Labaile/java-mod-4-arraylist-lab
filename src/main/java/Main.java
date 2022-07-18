import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(-5, 4, 13, -23, -65, 5, -2));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(7, 3, -3, -6, 5, 10, 8));

        ArrayList<Integer> res = mergeTwoArrayLists(l1, l2); // [4, 13, 5, 7, 3, 5, 10, 8]
        System.out.println(res);
    }

    public static ArrayList<Integer> mergeTwoArrayLists(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        // your code here
        int c1 = 0, c2 = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        while(c1 < l1.size() || c2 < l2.size()) {
            if(c1 < l1.size())
                res.add((Integer) l1.get(c1++));
            if(c2 < l2.size())
                res.add((Integer) l2.get(c2++));
        }
        return res;
    }
}
