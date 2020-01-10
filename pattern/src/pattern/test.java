package pattern;

import java.util.*;

public class test {

	public static void main(String[] args) {

		/*int i = 0;
		Integer a=10; 
		System.out.println(a);
		
		char c='1';
		int x=Character.getNumericValue(c);
		System.out.println(x);*/
		
		/*// ArrayList with Capacity 4
	      ArrayList<String> StudentList = new ArrayList<String>(4);
	      //Added 4 elements
	       StudentList.add("David");
	       StudentList.add("Tom");
	       StudentList.add("Rohit");
	       StudentList.add("Paul");
	      
	       System.out.println("Students in the list are : ");
	       System.out.println(StudentList);
	  
	       System.out.print("Is list contains the student Tom?");
	       System.out.println(StudentList.contains("Tom"));
	       System.out.print("Is list contains the student Sudhir?");
	       System.out.println(StudentList.contains("Sudhir"));*/
		
		/*ArrayList<Integer> al2 = new ArrayList<Integer>();
	      al2.add(1);
	      al2.add(99);
	      al2.add(56);
	      al2.add(13);
	      al2.add(44);
	      al2.add(6);

	      System.out.println("'1' is present in arraylist: "+al2.contains(1));
	      System.out.println("'55' is present in arraylist: "+al2.contains(55));
	      System.out.println("'44' is there in arraylist: "+al2.contains(44));
	      System.out.println("'7' is there in arraylist: "+al2.contains(7));*/      
		
		int a[] = {2,3,8,2,1,3};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!list.contains(a[i]))
			{
				list.add(a[i]);
			}
		}
		
		//int unique[] = list.toArray(new int[list.size()]);
		
		/*Integer unique[] = new Integer[list.size()];
		unique = list.toArray(unique);
		*/
		
		/*for(int number:unique)
		{
			System.out.println("Number = "+number);
		}*/
		/*for(int i=0;i<unique.length;i++)
		{
			System.out.println("Number = "+unique[i]);
		}*/
		Iterator itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		/*ArrayList<Integer> al2 = new ArrayList<Integer>();
	      al2.add(1);
	      al2.add(99);
	      al2.add(56);
	      al2.add(13);
	      al2.add(99);
	      al2.add(6);
		
	    List<Integer> list = new ArrayList<Integer>();
		
	    if(!list.contains(al2))
		{
			list.addAll(al2);
		}
	    
	    Integer unique[] = new Integer[list.size()];
		unique = list.toArray(unique);
		
		
		for(int number:unique)
		{
			System.out.println("Number = "+number);
		}*/
	}

}
