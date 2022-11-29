package Collections_Practice;

import java.util.Stack;

public class Stack_Practice {

	public static void main(String[] args) {
		Stack s = new Stack();

		//push() method used to add elements into the stack
		s.push(10);
		s.push(20);
		s.push(30);
		s.push("vinay");
		System.out.println(s);

		//peek() method is used to check whats the last element in the last which was added/present
		System.out.println(s.peek());

		//pop() method is used to remove the last elemet present in the stack
		System.out.println(s.pop());

		//empty() method is used to check wether the stack is empty or not returns value in boolean
		System.out.println(s.empty());

		//clear() method is used to clear or remove all the elenents in the stack
		//		s.clear();	
		//		System.out.println(s);
		//		
		//search() method is used to search for any value in the stack
		System.out.println(s.search(30));


	}
}
