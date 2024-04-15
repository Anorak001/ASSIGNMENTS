package lab;

public class pg2 {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		a[0][0]=1;a[0][1]=2;a[0][2]=3;
		a[1][0]=4;a[1][1]=5;a[1][2]=6;
		System.out.println("Original Matrix");
		for(int i=0;i<2;i++)
		{	for(int j=0;j<3;j++)
			{System.out.print(a[i][j]+ " ");}
			System.out.println();}
		System.out.println("transpose Matrix");
		for(int i=0;i<3;i++)
		{	for(int j=0;j<2;j++)
			{System.out.print(a[j][i]+ " ");}
			System.out.println();}
	}

}
