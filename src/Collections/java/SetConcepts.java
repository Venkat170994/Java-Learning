package Collections.java;

import java.util.*;


public class SetConcepts {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        LinkedHashSet<String> hashset = new LinkedHashSet();
        hashset.add("One");
        hashset.add("Two");
        hashset.add("Three");
        hashset.add("Four");
        hashset.add("Five");
        Iterator<String> i = hashset.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("\n");

        TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        Iterator<String> itr1 = al.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}