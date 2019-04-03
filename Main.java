
//compilation error

public class Main {
	public static void main(String[] args) {
              

	    { 
	    	 DCList <Integer> list = new DCList<>(); 
	    	 list.addAtPos(10, 1);
	    	 list.addAtStart(12);
	    	 list.addAtStart(15);
	    	 list.addAtStart(17);
	    	 list.addAtStart(18);
	    	 list.addAtStart(19);
	    	 list.display();
	    	 list.getClass();
	    	 list.removeFirst();
	    	 list.display();
	    	 list.removeAtPos(3);
	    	 list.display();
	    	 list.addAtStart(100);
	    	 list.display();
	    	 list.addAtEnd(300);
	    	 list.display();
	    	 System.out.println("cut at position 2 with value: " + list.get(2).data);
	    	 list.cut(2);
	    	 list.display();
	    	 
	    	 
	}
	

}
}