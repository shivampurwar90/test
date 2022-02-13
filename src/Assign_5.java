import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;


public class Assign_5 {

	
	public static void main(String[] args)
	{
		ArrayList obj=new ArrayList();
		obj.add("z");
		obj.add("y");
		obj.add("x");
		obj.add("w");
		obj.add("v");
		obj.add("u");
		obj.add("t");
		obj.add("s");
		obj.add("r");
		obj.add("q");
		obj.add(null);
		
		System.out.println("1:::::"+ " print array list"  +obj);
		obj.add("t");
		obj.add("s");
		obj.add("r");
		obj.add("q");
		obj.add(null);
		
		System.out.println("2:::::"+ " print array list"  +obj);
		
		obj.set(9,"B");
		
		System.out.println("3:::::"+ " print set"  +obj);
		
		LinkedList obj1=new LinkedList();
		obj1.add("A");
		obj1.add("Shivam");
		obj1.add("B");
		obj1.add("b");
		
		System.out.println("4::::" +"print Linkedlist"+obj1);
		
		obj1.addFirst("Ram");
		
		System.out.println("5::::"+ "print addfirst"+ obj1);
		
	obj1.addLast("Suresh");
	System.out.println("6::::"+ "print addlast"+ obj1);
	
	obj1.removeFirst();
	
	System.out.println("7::::"+ "print removefirst"+ obj1);
	
		obj1.removeLast();
		
		System.out.println("8::::"+ "print removelast"+ obj1);
		
		
		System.out.println("9::::"+ "print getfirst"+ obj1.getFirst());
		
		
		System.out.println("10::::"+ "print getlast"+ obj1.getLast());
		
		
		   HashSet obj2=new HashSet();
		   
		   obj2.add("Shivam");
		   obj2.add("Shivam");
		   obj2.add("Shivam");
		   obj2.add("Shivam");
		   obj2.add("Shivam");
		   obj2.add("Shivam");
		   
		   System.out.println("11:::::"+ "print hashsetlist" +obj2);
		   
		   obj2.add("A");
		   obj2.add("B");
		   obj2.add("V");
		   obj2.add("Z");
		   obj2.add("x");
		   
		   System.out.println("12:::::"+ "print hashsetlist" +obj2);
		   
		   
		   
		   
		
		
		
		
	
		
		
		
		
		

	}

}
