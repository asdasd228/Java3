import java.util.*;
import java.time.*;

/**
 * This program compares the performance of ArrayList
 * and LinkedList in terms of add, get, and remove operations.
 * It measures the time taken for each operation
 * and prints the results to the console.
 */
public class Main {
    public static void main(String[] args) {
        int n = 10000; //Amount of operations

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Testing add
        long start = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            arrayList.add(i);
        }
        long finish = System.nanoTime();
        long arrayListAddTime = finish - start;

        start = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            linkedList.add(i);
        }
        finish = System.nanoTime();
        long linkedListAddTime = finish - start;

        // Testing get
        start = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            arrayList.get(i);
        }
        finish = System.nanoTime();
        long arrayListGetTime = finish - start;

        start = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            linkedList.get(i);
        }
        finish = System.nanoTime();
        long linkedListGetTime = finish - start;

        // Testing remove
        start = System.nanoTime();
        for (int i = n - 1; i >= 0; --i) {
            arrayList.remove(i);
        }
        finish = System.nanoTime();
        long arrayListRemoveTime = finish - start;

        start = System.nanoTime();
        for (int i = n - 1; i >= 0; --i) {
            linkedList.remove(i);
        }
        finish = System.nanoTime();
        long linkedListRemoveTime = finish - start;

        // Printing results
        System.out.println("Метод(" + n + " раз)\tArrayList\tLinkedList");
        System.out.println("add\t\t\t\t\t" + arrayListAddTime + "\t\t" + linkedListAddTime);
        System.out.println("get\t\t\t\t\t" + arrayListGetTime + "\t\t" + linkedListGetTime);
        System.out.println("remove\t\t\t\t" + arrayListRemoveTime + "\t\t" + linkedListRemoveTime);
    }
}