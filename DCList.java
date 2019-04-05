import java.util.NoSuchElementException;





class DCList<T>
{
    protected Node<T> start;
    protected Node<T> end ;
    public int size;
    private int  h;
    private Node<T> p;
    
    /* Constructor */
    public DCList()
    {
        start = null;
        end = null;
        size = 0;
    }
    
    /* Function to get size of list */
    public int getSize()
    {
        return size;
    }
    /* Function to insert element at begining */
    public void addAtStart(T val)
    {
        Node <T> nptr = new Node<T>(val);    
        if (start == null)
        {            
            nptr.setNext(nptr);
            nptr.setPrev(nptr);
            start = nptr;
            end = start;            
        }
        else
        {
            nptr.setPrev(end);
            end.setNext(nptr);
            start.setPrev(nptr);
            nptr.setNext(start);
            start = nptr;        
        }
        size++ ;
    }
    /*Function to insert element at end */
    public void addAtEnd(T val)
    {
        Node <T> nptr = new Node<>(val);        
        if (start == null)
        {
            nptr.setNext(nptr);
            nptr.setPrev(nptr);
            start = nptr;
            end = start;
           
        }
        else
        {
            nptr.setPrev(end);
            end.setNext(nptr);
            start.setPrev(nptr);
            nptr.setNext(start);
            end = nptr;    
        }
        size++;
    }
    /* Function to insert element at position */
    public void addAtPos(T val , int pos)
    {
       
        if (pos == 1)
        {
            addAtStart(val);
            return;
        }     
        Node <T> nptr = new Node <>(val);    
        Node <T> ptr = start;
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Node <T> tmp = ptr.getNext();
                ptr.setNext(nptr);
                nptr.setPrev(ptr);
                nptr.setNext(tmp);
                tmp.setPrev(nptr);
            }
            ptr = ptr.getNext();            
        }
        size++ ;
    }
    
    public  T removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = start;
        start = start.next;
        
        start.prev = null;
        size--;
        
        System.out.println("deleted: "+tmp);
        return (T) tmp;
    }
    
    public T removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = end;
        end = end.prev;
        end.next = null;
        size--;
       
        return (T) tmp;
    }
    
    
     
    
    /* Function to delete node at position  */
    public void removeAtPos(int pos)
    {        
        if (pos == 1) 
        {
            if (size == 1)
            {
                start = null;
                end = null;
                size = 0;
                return; 
            }
            start = start.getNext();
            start.setPrev(end);
            end.setNext(start);
            size--; 
            return ;
        }
        if (pos == size)
        {
            end = end.getPrev();
            end.setNext(start);
            start.setPrev(end);
            size-- ;
        }
        Node <T> ptr = start.getNext();
        for (int i = 2; i <= size; i++)
        {   
        	
            if (i == pos)
            {
                Node<T> p = ptr.getPrev();
                Node <T> n = ptr.getNext();
 
                p.setNext(n);
                n.setPrev(p);
                size-- ;
                return;
            }
            ptr = ptr.getNext();
        }        
    }  
    
  
    
    /* Function to display status of list */
    public void display()
    {
        System.out.print("\nCircular Doubly Linked List = ");
        Node <T> ptr = start;
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getNext() == start) 
        {
            System.out.print(start.getData()+ " <-> "+ptr.getData()+ "\n");
            return;
        }
        System.out.print(start.getData()+ " <-> ");
        ptr = start.getNext();
        while (ptr.getNext() != start) 
        {
            System.out.print(ptr.getData()+ " <-> ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ " <-> ");
        ptr = ptr.getNext();
        System.out.print(ptr.getData()+ "\n");
    }
    
     
    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return start == null;
    }
    
    
    public void cut(int pos){
    	
    	
    	 Node <T> ptr = start.getNext();
         for (int i = 2; i <= size; i++)
         {   
         	
             if (i == pos)
             {
                 Node<T> p = ptr.getPrev();
                 Node <T> n = ptr.getNext();
  
                 p.setNext(null);
                 n.setPrev(p);
                 size-- ;
                 return;
             }
             ptr = ptr.getNext();
         } 
    	
    }
    
    
    public void clear(){		

		start = null;		

	}
    
    
    
    
	public Node<T> get(int position){

		for(Node<T> i = start; i!=null; i=i.getNext()){

			if(i.Pos == position){	

				p=i;

			}

		}

		return p;		

	}

	

	public int find(T value){

		for(Node<T> i = start; i!=null; i=i.getNext())

			if(value == i){

				h = i.getPosition()-1;

			}

		return h;	

	}

	

	public boolean contains(T value){

		

		for(Node<T> i = start; i!=null; i=i.getNext()){

				if(value == i){						

				return true;

				}

	   }

		return false;

	}

	public int size(){

			return this.size;		

	}
    
}
