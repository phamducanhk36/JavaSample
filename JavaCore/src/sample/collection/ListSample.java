package sample.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListSample {
    public static void main(String[] s){

        Object[] array = new Object[4];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        System.out.println("array" + array);
        for (Object o : array)
           System.out.print(o);

        System.out.println("");
        array[2] = 3;
        System.out.println("array" + array);
        for (Object o : array)
           System.out.print(o);

        System.out.println("");

        /* -------------ArrayList------------- */
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add(1, "2");
        System.out.println("arrayList" + arrayList);
        System.out.println("indexOf " + arrayList.indexOf("2"));
        System.out.println("lastIndexOf " + arrayList.lastIndexOf("2"));
        System.out.println("remove " + arrayList.remove("2"));
        System.out.println("arrayList" + arrayList);

        /* -------------LinkedList------------- */
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add(1, "2");
        System.out.println("linkedList" + linkedList);
        linkedList.addFirst("0");
        linkedList.addLast("4");
        System.out.println("linkedList" + linkedList);

        System.out.println("indexOf " + linkedList.indexOf("2"));
        System.out.println("indexOf " + linkedList.lastIndexOf("2"));
        System.out.println("getFirst " + linkedList.getFirst());
        System.out.println("getLast " + linkedList.getLast());

        System.out.println("offer " + linkedList.offer("1"));
        System.out.println("linkedList" + linkedList);

        System.out.println("peek " + linkedList.peek());
        System.out.println("linkedList" + linkedList);

        System.out.println("peekFirst " + linkedList.peekFirst());
        System.out.println("linkedList" + linkedList);

        System.out.println("peekLast " + linkedList.peekLast());
        System.out.println("linkedList" + linkedList);

        System.out.println("poll " + linkedList.poll());
        System.out.println("linkedList" + linkedList);

        System.out.println("pollLast " + linkedList.pollLast());
        System.out.println("linkedList" + linkedList);

        Iterator<Object> descendingIterator = linkedList.descendingIterator();
        System.out.println("descendingIterator ");
        while (descendingIterator.hasNext())
        System.out.print(descendingIterator.next() + ", ");
    }
}
