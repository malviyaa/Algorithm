
public class LinkedListStack<AnyType> implements StackInterface<AnyType> {

	private Node<AnyType> top;
	
	public LinkedListStack(){
		top = null;
	}
	private static class Node<AnyType>{
		public AnyType data;
		public Node<AnyType> next;
		
		public Node(AnyType data){
			this(data,null);
		}
		public Node(AnyType data,Node<AnyType> n){
			this.data = data;
			next = n;
		}
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==null;
	}
	@Override
	public AnyType pop() throws StackException {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new StackException("Stack is full");
		AnyType data = top.data;
		top=top.next;
		return data;
	}
	@Override
	public AnyType peek() throws StackException {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new StackException("Stack is full");
		return top.data;
	}
	@Override
	public void push(AnyType data) throws StackException {
		// TODO Auto-generated method stub
		top = new Node<AnyType>(data,top);
	}
	@Override
	public void clear() {

	}
	public static void main(String[] args){
		LinkedListStack<Integer> s = new LinkedListStack<Integer>();
		try{
			for(int i=0;i<6;i++)s.push(i);
			System.out.println(s);
			for(int i=0;i<5;i++)s.pop();
			System.out.println(s);
			
		}
		catch(StackException e){System.err.println(e);}
	}
}



interface StackInterface<AnyType>
{
 /**
   * Tests if the stack is empty.
   */
   public boolean isEmpty();

 /**
   *  Removes and returns the item at the top of this stack.
   */
   public AnyType pop() throws StackException;

 /**
   *  Returns the top item without its removal
   */
   public AnyType peek() throws StackException;

 /**
   * Inserts an item onto the top of the stack.
   */
   public void push(AnyType e) throws StackException;

 /**
   * Removes all items from the stack.
   */
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