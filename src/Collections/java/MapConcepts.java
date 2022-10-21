package Collections.java;

import java.util.*;

class MapConcepts {
    public static void main(String[] args) {
        Map map = new HashMap();
        //Adding elements to map
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");

        Set set = map.entrySet();//Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(100, "Amit");
        map1.put(101, "Vijay");
        map1.put(102, "Rahul");

        for (Map.Entry m : map1.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        TreeMap<Integer,String> map2=new TreeMap<Integer,String>();
        map2.put(100,"Amit");
        map2.put(102,"Ravi");
        map2.put(101,"Vijay");
        map2.put(103,"Rahul");
        System.out.println("Before invoking remove() method");
        for(Map.Entry m1:map2.entrySet())
        {
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
    }
}