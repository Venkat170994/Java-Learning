package Collections.java;

import java.util.*;


class ListConcepts {

    public static void main(String[] args) {

        //ArrayList
        System.out.println("Array List\n");
        List<String> list = new ArrayList<String>();
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }


        String[] item=list.toArray(new String[list.size()]);

        for(String value:item){
            System.out.println(value);
        }

        List<String> l2=new ArrayList<String>();
        l2=Arrays.asList(item);
        System.out.println(l2);
        //LinkedList
        System.out.println("Linked List\n");
        List<String> lnlist = new LinkedList<String>();
        lnlist.add("Ravi");//Adding object in arraylist
        lnlist.add("Vijay");
        lnlist.add("Ravi");
        lnlist.add("Ajay");

        Iterator itr1 = lnlist.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        //Vector
        System.out.println("Vector\n");
        Vector<String> v = new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr2 = v.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        //Stack
        System.out.println("Stack\n");
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr3 = stack.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

    }
}
