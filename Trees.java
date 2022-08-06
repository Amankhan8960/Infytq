// VALIDATE BST

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Codechef
{
 Node root;
    boolean isBST()  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                               Integer.MAX_VALUE);
    }
 
   
    boolean isBSTUtil(Node node, int min, int max)
    {
        if (node == null)
            return true;
 
        
        if (node.data < min || node.data > max)
            return false;
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }
 
    public static void main(String args[])
    {
        Codechef tree = new Codechef();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
 
        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}


// POSTORDER -

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node {
  int item;
  Node left, right;

  public Node(int key) {
  item = key;
  left = right = null;
  }
}
class Codechef
{

  Node root;

  Codechef() {
  root = null;
  }

  void postorder(Node node) {
    if (node == null)
      return;

    postorder(node.left);
    postorder(node.right);
    System.out.print(node.item + "->");
  }

  public static void main(String[] args) {

    Codechef tree = new Codechef();
    tree.root = new Node(1);
    tree.root.left = new Node(12);
    tree.root.right = new Node(9);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);
    System.out.println("Postorder traversal");
    tree.postorder(tree.root);
  }

}

//INORDER TRAVERSAL

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node {
  int item;
  Node left, right;

  public Node(int key) {
  item = key;
  left = right = null;
  }
}
class Codechef
{

  Node root;

  Codechef() {
  root = null;
  }

  void inorder(Node node) {
    if (node == null)
      return;

    inorder(node.left);
    System.out.print(node.item + "->");
    inorder(node.right);
    
  }

  public static void main(String[] args) {

    Codechef tree = new Codechef();
    tree.root = new Node(1);
    tree.root.left = new Node(12);
    tree.root.right = new Node(9);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);
    System.out.println("Inorder traversal");
    tree.inorder(tree.root);
  }

}

// Pre ORDER TRAVERSAL-
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node {
  int item;
  Node left, right;

  public Node(int key) {
  item = key;
  left = right = null;
  }
}
class Codechef
{

  Node root;

  Codechef() {
  root = null;
  }

  void preorder(Node node) {
    if (node == null)
      return;

    System.out.print(node.item + "->");
    
    preorder(node.left);
    
    
    preorder(node.right);
    
  }

  public static void main(String[] args) {

    Codechef tree = new Codechef();
    tree.root = new Node(1);
    tree.root.left = new Node(12);
    tree.root.right = new Node(9);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);
    System.out.println("preorder traversal");
    tree.preorder(tree.root);
  }

}

// LEVEL ORDER TRAVERSAL

 Node root;
 
    public BinaryTree() { root = null; }
 
    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }
 
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root)
    {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
 
            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
 
    /* Print nodes at the current level */
    void printCurrentLevel(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
       System.out.println("Level order traversal of
                                 binary tree is ");
       tree.printLevelOrder();
    }
