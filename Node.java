

 
/*  Class Node  */
class Node <T>
{
    public int Pos;
	public T data;
   public Node <T> next;
	Node <T> prev;
 
    /* Constructor */
    public Node(T data)
    {
        next = null;
        prev = null;
        this.data = data;
    }
    /* Constructor */
    public Node(T d, Node <T> n, Node <T> p)
    {
        data = d;
        next = n;
        prev = p;
    }
    /* Function to set link to next node */
    public void setNext(Node <T> n)
    {
        next = n;
    }
    /* Function to set link to previous node */
    public void setPrev(Node <T> p)
    {
        prev = p;
    }    
    /* Funtion to get link to next node */
    public Node <T> getNext()
    {
        return next;
    }
    /* Function to get link to previous node */
    public Node <T> getPrev()
    {
        return prev;
    }
    /* Function to set data to node */
    public void setData(T d)
    {
        data = d;
    }
    /* Function to get data from node */
    public T getData()
    {
        return data;
    }
    
    public int getPosition(){

		return Pos;	

	}
    
    
}