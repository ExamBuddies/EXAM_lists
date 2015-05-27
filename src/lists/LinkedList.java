package lists;

public class LinkedList <E>{
	private LinkedNode<E> first = null;
	private LinkedNode<E> last = null;
	
	
	public void add(E e){
		if(isEmpty()){ // if queue is empty before adding, set new node as front and back.
			LinkedNode<E> newNode = new LinkedNode<E>(e);
			first = newNode;
			last  = newNode;
		}
		else{ // else set .previous for current back to the new element, and set it to back.
			LinkedNode<E> newNode = new LinkedNode<E>(e);
			last.next = newNode;
			last = newNode;
			
		}
	}
	
//	public E get(int idx){
//		// måske lave en iterator til at finde index? eller bare loope?
//	}
	
	public boolean isEmpty(){
		if(first==null && last==null){
			return true;
		}
		else{
			return false;
		}
	}
}	
