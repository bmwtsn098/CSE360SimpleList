//Brandon Watson
//Class ID: 329
//Assignment 1
//This file contains the structure for a list type data structure.

package cse360assign2;

/**
 * The Class SimpleList represents a data structure that can hold 10 elements in the form of a array
 * It includes methods to add and remove elements from the list. As well as search for elements within
 * the list and print out the contains of the list in the form of a string.
 */
public class SimpleList {

	/** The list. */
	private int[] list;
	
	/** The count. */
	private int count;
	
	/**
	 * Instantiates a new simple list and sets the count to zero.
	 */
	public SimpleList() {
		
		list = new int[10];
		count = 0;
	}
	
	/**
	 * Adds the parameter numberToAdd to the front of the list.
	 *
	 * @param numberToAdd the integer to be added to the list
	 */
	public void add(int numberToAdd) {
		
		//if there are numbers in the list
		if(count != 0) {
			
			//move the numbers down to make room for the new one
			for(int counter = 8; counter >= 0; counter--) {
				
				list[counter + 1] = list[counter];
			}
			
			list[0] = numberToAdd;
			
			//only increment count if it isn't yet at 10
			if(count != 10) {
				
			count++;
			
			}
		//else list is empty and add number to first index and set count	
		} else {
		
			list[0] = numberToAdd;
			count = 1;
		}
	}
	
	/**
	 * Removes all instances of the specified parameter numberToRemove.
	 *
	 * @param numberToRemove the integer to be removed from the list
	 */
	public void remove(int numberToRemove) {
		
		//look for number throughout all of the list
		for(int counter = 0; counter < 10; counter++) {
			
			if(list[counter] == numberToRemove) {
				
				//if found move all elements after it to the left
				for(int innerCount = counter; innerCount < 9; innerCount++) {
					
					list[innerCount] = list[innerCount + 1];
				}
				
				if(count > 0) {
					
					count--;
				}
				
				//step count back to check for duplicates
				counter--;
			}
		}
	}
	
	/**
	 * Count the number of elements in the list.
	 *
	 * @return the number of elements in the list
	 */
	public int count() {
		
		return count;
	}
	
	/**
	 * Converts the current list into a String of all the elements separated by spaces
	 * 
	 * @return the string of integers from the list
	 */
	public String toString() {
		
		String output = "";
		
		for(int increment = 0; increment < count; increment++) {
			
			if(increment < count - 1) {
				
			output += list[increment] + " ";
			} else {
			
			output += list[increment];
			}
		}
		
		return output;
	}
	
	/**
	 * Search the list for the given parameter numberToFind.
	 *
	 * @param numberToFind the integer to search the list for.
	 * @return the index of the first instance of the specified value
	 */
	public int search(int numberToFind) {
		
		int output = -1;
		
		for(int increment = 0; increment < 10; increment++) {
			
			if(list[increment] == numberToFind && output == -1) {
				
				output = increment;
			}
		}
		
		return output;
	}
}

