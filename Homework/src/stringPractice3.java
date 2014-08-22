
public class stringPractice3
	{

	public static void main(String[] args)
		{
		String alphabet = "a b c d e f g h j k l m n o p q r s t u v w x y z";
		String noB = alphabet.substring(1);
		System.out.println(noB.replaceAll("\\s+",""));

	}
	}
