/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author mashalbutt
 */
public class Nonrepeating 
{
    private Queue<Character> queue;
    private Map<Character, Integer> count;
    private Queue<Character>display;
   
    public Nonrepeating()
    {
        queue = new LinkedList<>();
        count = new HashMap<>();
        display=new LinkedList<>();
    }

    public void add(char c) 
    { 
        display.add(c);
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
            System.out.println();
                System.out.println("No non repeating present");
                return '-';
               
        }
    }
      public void Display()
{
   
         for (Character element : display) 
         {
            System.out.print(element + " ");
        }
}
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        Nonrepeating inputStream = new Nonrepeating();
        System.out.println("enter number of characters: ");
        int size=s.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter character"+(i+1));
           char cc = s.next().charAt(0);
            inputStream.add(cc);
        }
//        inputStream.add('a');
//        inputStream.add('c');
//        inputStream.add('a');
//        inputStream.add('c');
        System.out.println("The original stream is:");
        inputStream. Display();
        System.out.println();
        System.out.println("The non repeating first value is : "+inputStream.getNonRepeating()); 
       
      
    }
}
