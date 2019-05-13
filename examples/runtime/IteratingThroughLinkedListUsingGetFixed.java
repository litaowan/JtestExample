
package examples.runtime;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;

/**
 * Iterating through a LinkedList using get(int index) is very inneficient,
 * list.iterator() should be used instead.
 */
public class IteratingThroughLinkedListUsingGetFixed extends TestCase {
    
    public void test() {
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < 50000; i++)
            list.add("element");
        long start_time = System.currentTimeMillis();
        // FIX: iterate through LinkedList using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            iterator.next();
        long elapsed = System.currentTimeMillis() - start_time;
        System.out.println("elapsed: " + elapsed + " milliseconds");
    }
}
