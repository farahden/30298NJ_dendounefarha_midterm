package data_structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
       // List<String> array2=new ArrayList<>();

        //adding data:
        array.add("colors");
        array.add("pink");
        array.add("white");
        array.add("black");
        array.add("green");
        array.add("yellow");
        System.out.println(array);

        //adding to a specific index
        array.add(2,"grey");

        //removing data
        array.remove("white");

        //removing from index
        array.remove(0);

        Iterator i = array.iterator();
        while ( i.hasNext()){ // advanced using Iterator for collections
            System.out.println(i.next());}

        System.out.println();
        System.out.println();
//*****For each loop
        for (Iterator j =array.iterator() ; j.hasNext();){
            System.out.println(j.next());}





    }

}
