import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n, i;
		Scanner sc = new Scanner(System.in);
		//System.out.print(" Please Enter any Number : ");
		n = sc.nextInt();
      //System.out.print("");

		for (i = 1; i <= n;i++)
		{
			if(n%i == 0)
			{
				System.out.println(i);

			}
		}
	}
}