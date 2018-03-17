/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package search_engine;
import java.util.*;
import java.io.*;

public class Search_Engine extends Indexer{

    public static void main(String[] args) {
        // TODO code application logic here
        DocumentParser dp = new DocumentParser();
        Indexer ind = new Indexer();
        HashMap <Integer,String> links = new HashMap();
        try
        {
        dp.parseFiles(new File("C:\\Users\\vaio1\\Desktop/sample.txt"),1);
        links.put(1,"C:\\Users\\vaio1\\Desktop/sample.txt");
        dp.parseFiles(new File("C:\\Users\\vaio1\\Desktop/ec2.txt"),2);
        links.put(2,"C:\\Users\\vaio1\\Desktop/ec2.txt");
        dp.parseFiles(new File("C:\\Users\\vaio1\\Desktop/test.txt"),3);
        links.put(3,"C:\\Users\\vaio1\\Desktop/test.txt");
        }
        catch(Exception e)
        {
         System.out.println(e.getMessage());
        }
        PriorityQueue pq = (ind.tfidf(DocumentParser.hm,"YashAdmin"));
        List<Integer>result = new ArrayList();
        while(pq.size()>0)
        {
            //System.out.println(pq.peek());
            Tuple t = (Tuple)pq.poll();
            System.out.println(links.get(t.doc));
        }
        
    }
    
    
}
