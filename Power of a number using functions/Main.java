 import java.util.Scanner;

    public class Main {



        public  static int power(int b, int p){
            int i,result = 1;

            for (i = 1; i <= p; i++){
                result = result * b;
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //int n = in.nextInt();
            int base = in.nextInt();
            int power = in.nextInt();
            int r = power(base,power);
            System.out.println(r);
        }
    }