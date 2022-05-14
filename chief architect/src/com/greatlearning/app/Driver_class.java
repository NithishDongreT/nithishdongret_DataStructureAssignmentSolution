/**
 * 
 */
package com.greatlearning.app;

//import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author NithishDongreT
 *
 */


public class Driver_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter the total no of floors in the building");
			int floors = sc.nextInt();
			int[] floor_size = new int[floors];
			
			for (int i = 0; i < floors; i++) {
				int temp = i+1;
				System.out.println("Enter the floor size given on day " + temp);
				floor_size[i] = sc.nextInt();
			}
			
			
			System.out.println("The order of construction is as follows");

			for (int i = 0; i < floors; i++) {
				if (i > 0 && i < floors)
					System.out.println("\n Day "+ i +": ");
				if (st.empty() == true){
					st.push(floor_size[i]);
					continue;
				} else if (st.empty() == false) {
					if (st.empty() == false && floor_size[i] > st.peek()) {
						st.push(floor_size[i]);
						continue;
					} else if (st.empty() == false && floor_size[i] < st.peek()) {
						while ( st.empty() == false && floor_size[i] < st.peek() ) {
							System.out.print(st.pop());
							System.out.print(" ");
							if (st.empty() == true) {
								st.push(floor_size[i]);
								break;
							}else if ( st.empty() == false && floor_size[i] > st.peek()) {
								st.push(floor_size[i]);
								break;
							}
						}
					}
				} 
			}
			if(st.empty() == false) {
//				st.push(floor_size[floors-1]);
				System.out.println("\n Day "+ floors +": ");
				while(st.empty() == false) {
					System.out.print(st.pop());
					System.out.print(" ");
				}
			}
			
		}

	}

}
