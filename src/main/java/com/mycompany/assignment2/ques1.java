/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author mashalbutt
 */

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


class node<T> 
{
    T data;
    node<T> next;

    node(T data) 
    {
        this.data = data;
        this.next = null;
    }
}

class Stack<T> 
{
    node<T> head;
    int size;
    
    Stack(int s)
    {
        head = null;
        size = s;
    }

    public int size() 
    {
        return size;
    }

    public void push(T item) 
    {
        node<T> newNode = new node<>(item);
        newNode.next = head;
        head = newNode;
    }

    public boolean isEmpty() 
    {
        return size == 0;
    }

    public T pop() 
    {
      
    if (isEmpty()) 
    {
        throw new EmptyStackException();
    }
    T item = head.data;
    head = head.next;
    size--;
    return item;


    }

    public T peek()
    {
        if (isEmpty()) 
        {
            throw new EmptyStackException();
        }
        return head.data;
    }

    public void display() 
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty.");
            return;
        }
        node<T> temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class ques1 
{
    
   
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter integer stack size:");
        int sInt = 0;
        try
        {
            sInt= obj.nextInt();
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input for stack size.");
            return;
        }
        Stack<Integer> stack = new Stack<>(sInt);
       
       

        for (int i = 1; i <= sInt; i++)
        {
            System.out.println("Enter Integer stack value " + i);
            int val = 0;
            try
            {
                val = obj.nextInt();
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("Invalid input for integer value.");
                return;
            }
            stack.push(val);
        }
        System.out.println("The values of stack are: ");
        stack.display();
        displayMenu(obj,stack);
        
        int sFloat;
        System.out.println("Enter float stack size:");
         try 
         {
            sFloat = obj.nextInt();
        } 
         catch (InputMismatchException e) 
        {
            System.out.println("Invalid input for stack size.");
            return;
        }
         
          Stack<Float> stac = new Stack<>(sFloat);
        for (int i = 1; i <= sFloat; i++)
        {
            System.out.println("Enter float stack value " + i);
            float val = 0;
            try 
            {
                val = obj.nextFloat();
            } catch (InputMismatchException e)
            {
                System.out.println("Invalid input for float value.");
                return;
            }
            stac.push(val);
        }
        System.out.println("The values of stack are: ");
        stac.display();
        displayMenu(obj,stac);

        int sString;
        System.out.println("Enter String stack size:");
         try 
         {
            sString = obj.nextInt();
        } catch (InputMismatchException e) 
        {
            System.out.println("Invalid input for stack size.");
            return;
        }
          Stack<String> sta = new Stack<>(sString);
        obj.nextLine();
        for (int i = 1; i <= sString; i++)
        {
            System.out.println("Enter String stack value " + i);
            String val = "";
            try 
            {
                val = obj.nextLine();
            } catch (NoSuchElementException e) 
            {
                System.out.println("Invalid input for string value.");
                return;
            }
        sta.push(val);
        }
        System.out.println("The values of stack are: ");
        sta.display();
        displayMenu(obj,sta);
    }
     public static <T> void displayMenu(Scanner obj,Stack<T>s)
    {
      
        String choice = "";
        do 
        {
            //obj.nextLine();
            System.out.println("Pop");
            System.out.println("Size");
            System.out.println("Isempty");
            System.out.println("Peek");
            System.out.println("Exit");
            System.out.println("Enter your choice:");
            obj.nextLine();
            choice = obj.nextLine();
            switch (choice)
            {
                case "Pop": 
                {
                    try 
                    {
                        System.out.println("The popped element is: " + s.pop());
                        System.out.println("The updated size of stack is: " + s.size());
                    }
                    catch (EmptyStackException e) 
                    {
                        System.out.println("Stack is empty cannot pop");
                    }
                    break;
                }
                case "Size": 
                {
                    System.out.println("The size of stack is: " + s.size());
                    break;
                }
                case "Isempty":
                {
                    System.out.println("The stack is: " + s.isEmpty());
                    break;
                }
                case "Peek": 
                {
                    try
                    {
                        System.out.println("The peeked element is: " + s.peek());
                    } 
                    catch (EmptyStackException e) 
                    {
                        System.out.println("Stack is empty Cannot peek");
                    }
                    break;
                }
                case "Exit": 
                {
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }

        } while (!"Exit".equals(choice));

    }
}
