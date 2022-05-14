/**
 * 
 */
package com.greatlearning.model;
//import com.greatlearning.model.Node;
import java.util.Stack;
/**
 * @author NithishDongreT
 *
 */
public class BinarySearchTree {
	public Node root;  
	public static Stack<Integer> st = new Stack<Integer>();
	  
    public BinarySearchTree(){  
        root = null;  
    }  
    
    public void insert(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  

        //Check whether tree is empty  
        if(root == null){  
            root = newNode;  
            return;  
          }  
        else {  
            //current node point to root of the tree  
            Node current = root, parent = null;  

            while(true) {  
                //parent keep track of the parent node of current node.  
                parent = current;  

                //If data is less than current's data, node will be inserted to the left of tree  
                if(data < current.data) {  
                    current = current.left;  
                    if(current == null) {  
                        parent.left = newNode;  
                        return;  
                    }  
                }  
                //If data is greater than current's data, node will be inserted to the right of tree  
                else {  
                    current = current.right;  
                    if(current == null) {  
                        parent.right = newNode;  
                        return;  
                    }  
                }  
            }  
        }  
    } 
    
    public void inorderTraversal(Node node) {  
    	  
        //Check whether tree is empty  
        if(root == null){  
            System.out.println("Tree is empty");  
            return;  
         }  
        else {  

            if(node.left!= null)  
                inorderTraversal(node.left);  
            System.out.print(node.data + " "); 
            st.push(node.data);
            if(node.right!= null)  
                inorderTraversal(node.right);  

        }  
    }  
}
