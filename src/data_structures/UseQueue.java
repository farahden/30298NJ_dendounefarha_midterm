package data_structures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {
        //queue using peek poll and add
        try{
        Queue queue=new LinkedList<>();
        queue.add("Dior");
        queue.add("Chanel");
        queue.add("Gucci");
        queue.add("Lancom");
        queue.add("Versace");
        System.out.println(queue);

        queue.peek();
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);

        //using forloop:
        Iterator value=queue.iterator();
        while(value.hasNext()){
            System.out.println(queue);
            //to add value:
            System.out.println(queue.add("Yve Saint Laurant"));
            //to execute a value without retrieving
            System.out.println(queue.peek());
            //to retrieve a value
            System.out.println(queue.poll());
            for (Iterator i = queue.iterator();i.hasNext();) {
                System.out.print(i.next() + ", ");
            }

        }
        }catch (NullPointerException e){
            System.out.println("queue is empty");
        }








    }

}
