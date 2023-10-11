/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mashalbutt
 */


public class ques3 
{
    
    
    public static void main(String []args)
    {
         ArrayList<int []> a=new ArrayList<>();
         Scanner s=new Scanner(System.in);
         System.out.println("enter number of intervals");
         int noi=s.nextInt(); 
        for (int i = 0; i < noi; i++) 
        {
            System.out.println("Enter start and end of interval " + (i + 1));
            int start = s.nextInt();
            int end = s.nextInt();
            int[] interval = {start, end};
            a.add(interval);
        }
//         a.add(new int[] {-10, -5});
//         a.add(new int[] {-7, -8});
//         a.add(new int[] {-4, 0});
//         a.add(new int[] {10, 18});
         MergeIntervals(a);
    }
         public static void MergeIntervals(ArrayList<int[]> a)
         {
             int currIndx=0;
         
          for(int i=1;i<a.size();i++)
         {
        
         int[] s = (int[]) a.get(currIndx);
         int secondValue = s[1];
         
          int[] s1 = (int[]) a.get(i);
          int firstValue = s1[0];
        

          if (secondValue > firstValue)
         {
                  s[1] = Math.max(s[1], s1[1]); 
         }
         else
          {
              
                currIndx++;
                a.set(currIndx, s1);
                 
          }
          
         }
         a.subList(currIndx +1, a.size()).clear();
         Display( a);
         
         }
         public static void Display(ArrayList a)
         {
              for (int i = 0; i < a.size(); i++)
     {
            int[] merge = (int[]) a.get(i);
            System.out.println(Arrays.toString(merge));
     }
         }
    
      
    
}

