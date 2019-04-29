import java.util.Scanner;
class Main{
  public static void greatest(int a,int b, int c){
        if(a > b && a > c){
            System.out.println(a);
        }
        else if(b > a && b > c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }




    }
	public static void main (String[] args){
	    // Type your code here
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        greatest(a,b,c);
	}
}