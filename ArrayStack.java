import java.util.*;

public class ArrayStack<AnyType> implements StackInterface<AnyType> {

	private static final int DEFAULT_CAPACITY = 15;
	private int top; // reference to the top element
	private AnyType[] A;
/*
 * creates a stack of the size initialCapacity
 */
	public ArrayStack(int initialCapacity){
		if (initialCapacity <=0)
			A = (AnyType[]) new Object[DEFAULT_CAPACITY];
		else
			A = (AnyType[]) new Object[initialCapacity];
		
		top = -1; // stack is empty
	}
	
	/*
	 * Creates a stack with the default capacity
	 */
	public ArrayStack(){
		this(DEFAULT_CAPACITY);
	}

	public boolean isEmpty(){
		return top ==-1;
	}
	public AnyType peek(){
		if(isEmpty()) throw new StackException("Stack is empty");
		return A[top];
	}
	
	public AnyType pop(){
		AnyType x = peek();
		A[top] = null;
		top --;
		return x;
	}
	
	public void push(AnyType e){
		if (top==A.length) throw new StackException("Stack has overflowed");
		top++;
		A[top] = e;
	}
	
	public void clear()
	{
		for(int i=0;i<=top;i++){
			A[i] = null;
			
			top = -1;
		}
	}
	
	public String toString(){
		if(isEmpty()) return "[]";
		StringBuffer out = new StringBuffer("[");
		for(int i=0;i<top;i++)
			out.append(A[i]+",");
		
		return out.toString();
	}
	
	public static void main(String[] args){
		ArrayStack<Integer> s = new ArrayStack<Integer>(6);
		try{
			for(int i=0;i<6;i++) s.push(i);
			
			//s.clear()
			System.out.println(s);
			for(int i=0;i<5;i++)
				s.pop();
			System.out.println(s);
			
		} catch(StackException e){
			System.err.println(e);
		}
		
	}
	
}

interface StackInterface<AnyType>{
	/*
	 * Tests if the stack is empty
	 */
	
	public boolean isEmpty();
	/*
	 * Remove and returns the item at the top of this stack.
	 */
	public AnyType pop() throws StackException;
	
	/*
	 * 
	 */
	public AnyType peek() throws StackException;
	
	public void push(AnyType e) throws StackException;
	
	public void clear();	
	
}
class StackException extends RuntimeException {
	public StackException(String name){
		super(name);
	}
	public StackException(){
		super();
	}
}
