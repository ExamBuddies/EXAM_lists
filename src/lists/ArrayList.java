package lists;

public class ArrayList <E>
{
	private E[] elementData;
	private int size;

	private static final int DEFAULT_CAPACITY = 100;  

	public ArrayList(){
		this(DEFAULT_CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity)
	{
		if(capacity < 0)
		{
			throw new IllegalArgumentException();
		}
		elementData = (E[]) new Object[capacity];
	}

	public int size(){
		return size;
	}

	public E get(int index)
	{
		return elementData[index];
	}

	public String toString(){
		if(size==0){
			return "[]";
		}
		else{
			String result = "[" + elementData[0].toString();
			for(int i = 1; i < size; i++){
				result += ", " + elementData[i].toString();
			}
			result += "]";
			return result;
		}
	}
	
	public int indexOf(E value){
		for(int i = 0; i < size; i++){
			if(elementData[i] == value){
				return i;
			}
		}
		return -1;
	}

	//      pre: size <= ElementData.length	
			//      post: add value to end of list
	public void add(E value)
	{
		checkCapacity(size + 1);
		elementData[size].equals(value);
		size++;
	}
	public void add(int index, E value){
		for(int i = size; i >= index + 1; i--){
			elementData[i] = elementData[i-1];
		}
		elementData[index] = value;
		size++;
	}
	
	public void remove(int index){
		checkIndex(index);
		for(int i = index; i < size; i++){
			elementData[i] = elementData[i + 1];
		}
		elementData[size - 1] = null;
		size--;
	}
	
	public void clear(){
		for(int i = 0; i < size; i++){
			elementData[i] = null;
		}
		size = 0;
	}
	
	public boolean contains(E value){
		return indexOf(value) >= 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void set(int index, E value){
		checkIndex(index);
		elementData[index] = value;
	}
	
	public void addAll(ArrayList<E> other){
		checkCapacity(size + other.size);
		for(int i = 0; i < other.size; i++){
			add(other.elementData[i]);
		}
	}
	
	public void ensureCapacity(int capacity)
	{
		if(capacity > elementData.length)
		{
			int newCapacity = elementData.length * 2 + 1;
			if(capacity > newCapacity)
			{
				newCapacity = capacity;
			}
			@SuppressWarnings("unchecked")
			E[] list = (E[])new Object[newCapacity];
			for (int i = 0; i < size; i++)
			{
				list[i] = elementData[i];
			}
			elementData = list;
		}
	}
	private void checkCapacity(int capacity)
	{
		if(capacity > elementData.length)
		{
			throw new IllegalStateException("exeeded list capacity");
		}
	}
	private void checkIndex(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("Index: " + index);
		}
	}
}