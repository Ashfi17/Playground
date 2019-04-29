import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int temp = 1;
      int n = sc.nextInt();
      for (int i = 1; i <= n; i++) {
			System.out.println(temp);
         temp = 2*i+1;
        
	}
}
}