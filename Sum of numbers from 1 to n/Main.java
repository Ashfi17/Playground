import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int i;
      int sum = 0;
      int n = sc.nextInt();
      for( i = 1; i <= n; ++i)
        {
             sum = sum + i;
            //sum += i;
	}
      System.out.println(sum);
}
}