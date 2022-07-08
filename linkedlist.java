// Inserstion

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main { 
    
    Node head;
    static class Node { 
    
        int data; 
        Node next; 
    
        
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 

    
    public static Main insert(Main list, int data) 
    { 
        
        Node new_node = new Node(data); 
        new_node.next = null; 
    
        
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
    
           
            last.next = new_node; 
        } 
    
       
        return list; 
    } 
    
    public static void printList(Main list) 
    { 
        Node currNode = list.head; 
     
        System.out.print("LinkedList: "); 
     
        while (currNode != null) { 
            
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Main list = new Main(); 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
        printList(list); 
	}
}


// Deletion at Beginning
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main { 
    
    Node head,tail;
    static class Node { 
    
        int data; 
        Node next; 
    
        
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
    
    public static Main insert(Main list, int data) 
    { 
        
        Node new_node = new Node(data); 
        new_node.next = null; 
    
        
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
    
           
            last.next = new_node; 
        } 
    
       
        return list; 
    } 
    
    public static void printList(Main list) 
    { 
        Node currNode = list.head; 
     
        System.out.print("LinkedList: "); 
     
        while (currNode != null) { 
            
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
    }
    public void deleteFromStart() {  
  
          
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            
            if(head != tail) {  
                head = head.next;  
            }  
            else {  
                head = tail = null;  
            }  
        }  
    }  
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Main list = new Main(); 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
        printList(list); 
        System.out.println();
        list.deleteFromStart();
        printList(list);
	}
}
//Deletion at end
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main { 
    
    Node head,tail;
    static class Node { 
    
        int data; 
        Node next; 
    
        
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
    
    public static Main insert(Main list, int data) 
    { 
        
        Node new_node = new Node(data); 
        new_node.next = null; 
    
        
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
    
           
            last.next = new_node; 
        } 
    
       
        return list; 
    } 
    
    public static void printList(Main list) 
    { 
        Node currNode = list.head; 
     
        System.out.print("LinkedList: "); 
     
        while (currNode != null) { 
            
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
    }
    public void deleteFromEnd() {  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            if(head != tail ) {  
                Node current = head;  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                tail = current;  
                tail.next = null;  
            }  
            else {  
                head = tail = null;  
            }  
        }  
    }  
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Main list = new Main(); 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
        printList(list); 
        System.out.println();
      while(list.head!=null){
          list.deleteFromEnd();
          printList(list);
          System.out.println();
      }
        
	}
}

