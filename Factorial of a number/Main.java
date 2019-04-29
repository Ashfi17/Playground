import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int  n,fact = 1,i,a,b;
      Scanner sc = new Scanner(System.in);
		//System.out.print(" Please Enter any Number : ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++){

			fact = fact * i;

		}
		System.out.println(fact);
	}
}