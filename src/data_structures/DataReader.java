package data_structures;

import com.mysql.cj.jdbc.integration.c3p0.MysqlConnectionTester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;

public class DataReader {

    /** INSTRUCTIONS
     *
     * Create an API to read the .txt file and print it to the console.
     *      HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     *
     * Store and retrieve the file to/from a database table.
     *
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     *
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) {
        String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car.txt";
        MysqlConnectionTester connection = new MysqlConnectionTester();
        BufferedReader reader = null;
        ArrayList<Iterator> convertTextToList = new ArrayList<>();
        try {

           // connection.activeCheckConnection(connection1);
            //reader = new BufferedReader;
            String textLine = reader.toString();
            System.out.println("***************");
            while (textLine != null) {


                textLine = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("IOException occured");
        } catch (Exception e) {
// System.out.println("an Exception happened");
            e.fillInStackTrace();
            e.getMessage();
            //System.out.println("$$");
// words = textLine.split(" ", -2);//split again the line to get seperate words
            //tomysql.insertDataFromStringdToSqlTable(textLine +" " +br.readLine(), "Data_Reader_Mentoring", "Self_Driving");

        }
    }
}