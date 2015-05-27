package lists;

public class LinkedNode <E>{
	public E data;
	public LinkedNode<E> next;
	
	public LinkedNode(E data){
		this(data,null);
	}
	
	public LinkedNode(E data, LinkedNode<E> next){
		this.data = data;
		this.next = next;
	}
}
