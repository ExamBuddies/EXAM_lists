package lists;

public class ArrayList <E>
{
        private E[] elementData;
        private int size;
       
        private static final int DEFAULT_CAPACITY = 100;  
//       
//        public static void main(String[] args)
//        {
//       
//                ArrayList al = new ArrayList(10);
//               
//                for(int i = 1; i < 10; i++)
//                {
//                        al.add(i);
//                }
//        }
// 
 
       
        public ArrayList(int capacity)
        {
                if(capacity < 0)
                {
                        throw new IllegalArgumentException();
                }
                elementData = (E[]) new Object[capacity];
        }
       
//      pre: size <= ElementData.length
//      post: add value to end of list
        public void add(E value)
        {
                checkCapacity(size + 1);
                elementData[size] = value;
                size++;
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
        public void add(int index, E value) // wat???
        {
                for(int i = size; i >= index + 1; i--)
                {
                        elementData[i] = elementData[i-1];
                }
        }
        
        public E get(int index)
        {
        	return elementData[index];
        }
        
        public void remove(int index) // ikke testet
        {
        	for(int i = elementData.length; i>=index; i--)
        	{
        		if(elementData[i] != null)
        		{
        			elementData[i-1] = elementData[i];
        			if(elementData[i+1] == null){
        				elementData[i] = null;
        			}
        		}
        	}
        }
}