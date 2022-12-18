package pr11new;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class CompareClasses {
    ArrayList<Long> arrayList;
    LinkedList<Long> linkedList;

    public void testAdd(int k){
        arrayList = new ArrayList<Long>();
        linkedList = new LinkedList<Long>();


        Date startLinked = new Date();
        for(int i = 0; i < k; i++) {
            linkedList.add(System.currentTimeMillis());
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for(int i = 0; i < k; i++) {
            arrayList.add(System.currentTimeMillis());
        }
        Date finishArray= new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        System.out.println("========Add========");
        System.out.println("Add elements " + k);
        System.out.println("LinkedList: " + linkedTime + " ms");
        System.out.println("ArrayList: " + arrayTime + " ms\n");
    }

    public void testInsert(int k){
        arrayList = new ArrayList<Long>();
        linkedList = new LinkedList<Long>();

        Date startLinked = new Date();
        for(int i = 0; i < k; i++) {
            linkedList.add(0,System.currentTimeMillis());
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for(int i = 0; i < k; i++) {
            arrayList.add(0,System.currentTimeMillis());
        }
        Date finishArray= new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        System.out.println("======Insert elements to begin======");
        System.out.println("Insert elements " + k);
        System.out.println("LinkedList: " + linkedTime + " ms");
        System.out.println("ArrayList: " + arrayTime + " ms\n");

    }

    public void testRemove(int k){
        arrayList = new ArrayList<Long>();
        linkedList = new LinkedList<Long>();

        for(int i = 0; i < k; i++) {
            linkedList.add(0,System.currentTimeMillis());
        }

        for(int i = 0; i < k; i++) {
            arrayList.add(0,System.currentTimeMillis());
        }

        Date startLinked = new Date();
        for(int i = 0; i < k; i++) {
            linkedList.remove(0);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for(int i = 0; i < k; i++) {
            arrayList.remove(0);
        }
        Date finishArray= new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        System.out.println("======Remove======");
        System.out.println("Remove elements " + k);
        System.out.println("LinkedList: " + linkedTime + " ms");
        System.out.println("ArrayList: " + arrayTime + " ms\n");

    }

    public void testFind(int k){
        arrayList = new ArrayList<Long>();
        linkedList = new LinkedList<Long>();

        for(int i = 0; i < k; i++) {
            linkedList.add(0,System.currentTimeMillis());
        }

        for(int i = 0; i < k; i++) {
            arrayList.add(0,System.currentTimeMillis());
        }

        Date startLinked = new Date();
        for(int i = 0; i < k; i++) {
            linkedList.get(i);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for(int i = 0; i < k; i++) {
            arrayList.get(i);
        }
        Date finishArray= new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        System.out.println("======Find======");
        System.out.println("Remove elements " + k);
        System.out.println("LinkedList: " + linkedTime + " ms");
        System.out.println("ArrayList: " + arrayTime + " ms\n");

    }

}