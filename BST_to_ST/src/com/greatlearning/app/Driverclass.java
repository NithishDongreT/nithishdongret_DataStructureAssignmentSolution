/**
 * 
 */
package com.greatlearning.app;
import java.util.Arrays;

import com.greatlearning.model.*;

/**
 * @author NithishDongreT
 *
 */
public class Driverclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Creating a binary search tree
		BinarySearchTree bt = new BinarySearchTree();
		
		bt.insert(50);
		bt.insert(30); 
		bt.insert(60); 
		bt.insert(10); 
		bt.insert(55);

//		while doing the inorder traversal data elements are saved in stack
		bt.inorderTraversal(bt.root);  

//		converting stack elements to array elements of string type
        String[] element = Arrays.toString(BinarySearchTree.st.toArray()).replaceAll("\\[", "").replaceAll("]", "").replaceAll(" ", "").split(",");
        
//        Array for saving integer values this array will hold the values in the sorted order
        int[] array = new int[element.length];
        
        for (int i = 0; i < element.length; i++) {
        	array[i] = Integer.valueOf(element[i]);
        }

//        creating a new BinarySearchTree for skewedTree and inserting elements
        BinarySearchTree skewedTree = new BinarySearchTree();
        
        for (int i = 0; i < element.length; i++) {
        	skewedTree.insert(array[i]);
        }
        
//        showing the elements of skewedTree
        System.out.println();
        skewedTree.inorderTraversal(bt.root);

	}

}
