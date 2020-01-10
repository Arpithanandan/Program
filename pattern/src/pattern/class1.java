package pattern;

public class class1 {

	public static void main(String[] args) {

		for(String s: args)
			System.out.println(s);

	}

}

 class class2 {

	public static void main(String[] args) {

		String names[] = {"Gopi","Kamal","Vinay","Neeta"};
		class1.main(names);
		

	}

}
