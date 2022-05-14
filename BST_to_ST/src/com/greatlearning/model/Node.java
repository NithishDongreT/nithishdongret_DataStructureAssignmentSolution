/**
 * 
 */
package com.greatlearning.model;

/**
 * @author NithishDongreT
 *
 */
public class Node {
	 int data;  
     Node left;  
     Node right;  

     public Node(int data){  
         //Assign data to the new node, set left and right children to null  
         this.data = data;  
         this.left = null;  
         this.right = null;  
     }  
}
