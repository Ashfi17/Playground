import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   if (num >= 100) {
		   while (num >= 100) {
			   num = num / 1000;
		   }
	   }
	   else{
	   	num = num % 10;
	   }
	   num = num % 10;
	    System.out.println(num);
    }
}