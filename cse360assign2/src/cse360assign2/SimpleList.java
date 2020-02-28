//Brandon Watson
//Class ID: 329
//Assignment 2
//This file contains the structure for a list type data structure.

package cse360assign2;

// TODO: Auto-generated Javadoc
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
	 * If the list is full increase its size by 50%
	 * Keep track of the number of integers in the list
	 *
	 * @param numberToAdd the integer to be added to the list
	 */
	public void add(int numberToAdd) {
		
		//if list is full
		if(count == list.length) {
			
			//increase size
			int[] temp = new int[(int) (list.length * 1.5)];
			
			//add number to the beginning
			temp[0] = numberToAdd;
			//add rest of the list after new number
			for(int counter = 0; counter < list.length; counter++) {
				
				temp[counter + 1] = list[counter];
			}
			
			//replace old list with new one
			list = temp;
			
			count++;
		}
		//if there are numbers in the list
		else if(count != 0) {
			
			//move the numbers down to make room for the new one
			for(int counter = list.length - 2; counter >= 0; counter--) {
				
				list[counter + 1] = list[counter];
			}
			
			list[0] = numberToAdd;
			//increment count
			count++;
			
		//else list is empty and add number to first index and set count	
		} else {
		
			list[0] = numberToAdd;
			count = 1;
		}
	}
	
	/**
	 * Removes all instances of the specified parameter numberToRemove.
	 * If the list is 25% empty, shorten the list by 25%
	 * Keep track of the number of integers in the list
	 *
	 * @param numberToRemove the integer to be removed from the list
	 */
	public void remove(int numberToRemove) {
		
		//look for number throughout all of the list
		for(int counter = 0; counter < list.length; counter++) {
			
			if(list[counter] == numberToRemove) {
				
				//if found move all elements after it to the left
				for(int innerCount = counter; innerCount < list.length - 1; innerCount++) {
					
					list[innerCount] = list[innerCount + 1];
				}
				
				if(count > 0) {
					
					count--;
				}
				
				//step count back to check for duplicates
				counter--;
			}
		}
		
		//check size minus length to get empty space and check if it is greater than 25%
		if((list.length - count) > (int)(list.length*.25)) {
			
			//new array with new size
			int[] temp = new int[list.length - (int)(list.length * .25)];
			
			//copy over elements to new array
			for(int counter = 0; counter < temp.length; counter++) {
				
				temp[counter] = list[counter];
			}
			
			//replace old list with new one
			list = temp;
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
	 * Converts the current list into a String of all the elements separated by spaces.
	 *
	 * @return the string of integers from the list
	 */
	public String toString() {
		
		String output = "";
		
		//go through list
		for(int increment = 0; increment < count; increment++) {
			
			//for all number before the last one
			if(increment < count - 1) {
				
			output += list[increment] + " ";
			
			//for the last one don't include the space
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
		
		//look for numbberToFind
		for(int increment = 0; increment < 10; increment++) {
			
			//find only the first if the output has not already been set
			if(list[increment] == numberToFind && output == -1) {
				
				//if found set output
				output = increment;
			}
		}
		
		return output;
	}
	
	/**
	 * Append the numtoAppend to the end of the list.
	 * Increase the list size by 50% if the list is full
	 * Keep track of the number of integers in the list
	 *
	 * @param numToAppend the number to append
	 */
	public void append(int numToAppend) {
		
		//if list is full
		if(count == list.length) {
			
			//increase size
			int[] temp = new int[(int) (list.length * 1.5)];
			
			//add number to the end
			temp[list.length] = numToAppend;
			//add rest of the list to the beginning
			for(int counter = 0; counter < list.length; counter++) {
				
				temp[counter] = list[counter];
			}
			
			//replace old list with new one
			list = temp;
			
			//increment count
			count++;
		}
		//if there are numbers in the list
		else if(count != 0) {
			
			list[count] = numToAppend;
			
			//increment count
			count++;
			
		//else list is empty and add number to first index and set count	
		} else {
		
			list[0] = numToAppend;
			count = 1;
		}
	}
	
	/**
	 * Returns the first element in the list
	 * returns -1 if the list is empty
	 *
	 * @return the integer at the beginning of the list
	 */
	public int first() {
		
		int output = -1;
		
		//check if the list is empty
		if(count > 0) {
			
			output = list[0];
		}
		
		return output;
	}
	
	/**
	 * Returns the last element in the list
	 * returns -1 if the list is empty
	 *
	 * @return the integer at the end of the list
	 */
	public int last() {
		
		int output = -1;
		
		//check if the list is empty
		if(count > 0) {
			
			output = list[count - 1];
		}
		
		return output;
	}
	
	/**
	 * Returns the number of spaces in the list
	 *
	 * @return the number of spaces in the list
	 */
	public int size() {
		
		return list.length;
	}

}