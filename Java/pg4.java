package lab;

public class pg4 {

	public static void main(String[] args) {

        float a = Float.parseFloat(args[0]);
        char choice = args[1].charAt(0); // Extracting the operator
        float b = Float.parseFloat(args[2]);

		switch(choice)
		{ 
		case'+':System.out.println(a+b);break;
		case'-':System.out.println(a-b);break;
		case'*':System.out.println(a*b);break;
		case'/':System.out.println(a/b);break;
		case'%':System.out.println(a%b);break;
		default:System.out.println("Invalid");break;
		
		}

	}

}
