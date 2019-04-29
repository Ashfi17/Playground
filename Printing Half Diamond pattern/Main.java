import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
        //int i,j;
        int n = sc.nextInt();
        for(int curr_row = 1; curr_row <= n; ++curr_row)
        {
            // Handle space for each row
            for(int space = 1; space <=  n - curr_row; space++)
            {
                System.out.print(" ");
            }
            // Handle stars for each row
            for(int curr_col = 1; curr_col <= (2 * curr_row - 1); ++curr_col)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}