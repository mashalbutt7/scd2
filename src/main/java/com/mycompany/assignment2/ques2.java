/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author mashalbutt
 */
public class ques2 
{
    private Queue<Character> queue;
    private Map<Character, Integer> count;
   
    public ques2()
    {
        queue = new LinkedList<>();
        count = new HashMap<>();
    }

    public void add(char c) 
    { 
    count.put(c, count.getOrDefault(c, 0) + 1);
    if (count.get(c) > 1)
   
    {
        queue.remove(c); 
    }
    else
     
        queue.add(c);
        
      
    }

    public char getNonRepeating()
    {
        char NonRepeatingFirst = '-';

        if (!queue.isEmpty()) 
        {
            NonRepeatingFirst = queue.peek();
            return NonRepeatingFirst;
        }

        
        else
        {
                System.out.println("No non repeating present");
                return '-';
               
        }
    }

    public static void main(String[] args) 
    {
        
        ques2 inputStream = new ques2();
        inputStream.add('a');
        inputStream.add('b');
        inputStream.add('b');
    
        System.out.println("The non repeating first value is : "+inputStream.getNonRepeating()); 
       
      
    }
}
