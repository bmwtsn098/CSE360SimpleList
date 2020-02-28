//Brandon Watson
//Class ID: 329
//Assignment 2
//This file contains all the JUnit test cases for the SimpleList class

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	 //Test for successful creation of SimpleList object.
	@Test
	public void testSimpleList() {
		SimpleList testList = new SimpleList();
		
		assertNotNull(testList);
	}
	
	//Test size method after initialization.
	@Test
	public void testSimpleListSize() {
		SimpleList testList = new SimpleList();
		
		assertEquals(0, testList.count());
	}
	
	//Test add method for one addition.
	@Test
	public void testAddCount() {
		SimpleList testList = new SimpleList();
		
		testList.add(5);
		
		assertEquals(1, testList.count());
	}
	
	//Test add method for more additions.
	@Test
	public void testAddCountFour() {
		SimpleList testList = new SimpleList();
		
		testList.add(5);
		testList.add(4);
		testList.add(4);
		testList.add(4);
		
		assertEquals(4, testList.count());
	}
	
	//Test add method for overflow of list.
	@Test
	public void testAddTenNumbers() {
		SimpleList testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.add(11);
		
		assertEquals(11, testList.count());
	}
	
	//Test toString method with one element.
	@Test
	public void testAddPrint() {
		SimpleList testList = new SimpleList();
		
		testList.add(5);
		
		assertEquals("5", testList.toString());
	}
	

	
	//Test toString with three numbers.
	@Test
	public void testAddPrintThreeNumbers() {
		SimpleList testList = new SimpleList();
		
		testList.add(5);
		testList.add(4);
		testList.add(4);
		
		assertEquals("4 4 5", testList.toString());
	}
	
	//Test toString with a full list.
	@Test
	public void testAddPrintTenNumbers() {
		SimpleList testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.add(11);
		
		assertEquals("11 10 9 8 7 6 5 4 3 2 1", testList.toString());
	}

	//Test remove method with one element.
	@Test
	public void testRemove() {
		SimpleList testList = new SimpleList();
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.remove(3);
		
		assertEquals("5 4 2 1", testList.toString());
	}
		
		//Test remove method with two different elements.
		@Test
		public void testRemoveTwo() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(2);
			testList.add(3);
			testList.add(4);
			testList.add(5);
			testList.remove(3);
			testList.remove(5);
			
			assertEquals("4 2 1", testList.toString());
		}
		
		//Test remove method with duplicate elements.
		@Test
		public void testRemoveMultiple() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(2);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.remove(4);
			
			assertEquals("5 2 1", testList.toString());
		}
		
		//Test remove method at end of list.
		@Test
		public void testRemoveEnd() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.remove(1);
			
			assertEquals("5 4 4", testList.toString());
		}
		
		//Test remove method to make sure it keeps the correct count value.
		@Test
		public void testRemoveCount() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.remove(1);
			
			assertEquals("5 4 4", testList.toString());
		}
		
		//Test remove method to remove all elements and not go out of bounds of the array.
		@Test
		public void testRemoveCountAll() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.remove(1);
			testList.remove(4);
			testList.add(6);
			testList.add(4);
			testList.remove(5);
			testList.remove(6);
			testList.remove(4);
			
			assertEquals(0, testList.count());
		}
		
		//Test search method with one element.
		@Test
		public void testSearch() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.add(6);
			testList.add(4);
			testList.search(4);
			
			assertEquals(0, testList.search(4));
		}
		
		//Test search method on an element in the middle.
		@Test
		public void testSearchMiddle() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.add(6);
			testList.add(4);
			testList.search(5);
			
			assertEquals(2, testList.search(5));
		}
		
		//Test search method on an element at the end.
		@Test
		public void testSearchEnd() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.add(6);
			testList.add(4);
			testList.search(1);
			
			assertEquals(5, testList.search(1));
		}

		//Test search when element not found.
		@Test
		public void testSearchNotFound() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.add(6);
			testList.add(4);
			testList.search(8);
			
			assertEquals(-1, testList.search(8));
		}
		
		//Test append
		@Test
		public void testAppend() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.append(6);
			testList.append(7);
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.append(6);
			
			assertEquals("4 1 1 5 4 4 1 1 6 7 6", testList.toString());
		}
		
		//Test append on empty list
		@Test
		public void testAppendEmpty() {
			SimpleList testList = new SimpleList();
			
			testList.append(6);
			
			assertEquals("6", testList.toString());
		}
		
		//Test first
		@Test
		public void testFirst() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.append(6);
			testList.append(7);
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.append(6);
			
			assertEquals(4, testList.first());
		}
		
		//Test last
		@Test
		public void testLast() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.append(6);
			testList.append(7);
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.append(6);
			
			assertEquals(6, testList.last());
		}
		
		//Test size when adding
		@Test
		public void testSize() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.append(6);
			testList.append(7);
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.append(6);
			
			assertEquals(15, testList.size());
		}
		
		//Test size when removing
		@Test
		public void testSizeRemove() {
			SimpleList testList = new SimpleList();
			
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.add(4);
			testList.add(5);
			testList.append(6);
			testList.append(7);
			testList.add(1);
			testList.add(1);
			testList.add(4);
			testList.append(6);
			testList.remove(1);
			testList.remove(4);
			
			assertEquals(9, testList.size());
		}
		
		//Test empty list first and last
		@Test
		public void testEmpty() {
			SimpleList testList = new SimpleList();
			
			assertEquals(-1, testList.first());
			assertEquals(-1, testList.last());
			assertEquals(10, testList.size());
			assertEquals(0, testList.count());
		}
		
}
