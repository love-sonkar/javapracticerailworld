import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

public class AdvanceCollection {
    public static void main(String[] args) {

        // LinkedList
        LinkedList<Integer> test = new LinkedList<Integer>();
        test.add(33);
        test.add(8);
        test.add(18);
        test.add(80);
        test.pop();
        System.out.println(test + " LinkedList ");

        // Stack
        Stack<Integer> sta = new Stack<Integer>();
        sta.add(33);
        sta.add(313);
        sta.add(233);
        sta.add(353);
        sta.pop();
        System.out.println(sta);

        // Hashset
        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(9);
        hash.add(13);
        hash.add(44);
        hash.add(2);
        hash.add(2);
        hash.add(9);
        System.out.println(hash);

        // linkedhashset
        LinkedHashSet<Integer> llset = new LinkedHashSet<Integer>();
        llset.add(8);
        llset.add(18);
        llset.add(82);
        llset.add(8);
        System.out.println(llset);

        // TreeHashset
        TreeSet<Integer> tsett = new TreeSet<Integer>();
        tsett.add(9);
        tsett.add(91);
        tsett.add(19);
        tsett.add(98);
        tsett.add(9);
        System.out.println(tsett + " Tree set");
    }
}
