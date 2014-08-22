
public class stringPractice6
	{

	public static void main(String[] args)
		{
		String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		int x;
		int total = 0;
		for(x = 0; x<=50; x++)
			if(x%2 == 1)
				total = total + 1;
				
		System.out.println("The number of spaces is " + total);
	}
	}
