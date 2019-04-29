
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int first_half = n/2;
        int temp;

        for (int i = 0; i < first_half; i++){
            for (int j = i+1; j < first_half ; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
       // System.out.println("first half ascend sort is: ");
        for (int i =0; i < first_half; i++)
            System.out.print(a[i]+" ");

        for (int j =first_half; j < n; j++)
            System.out.print(a[j]+" ");
    }
}














































        /*Dog dog = new Dog();
        dog.name = "tony";
        dog.color = "Black";
        dog.Breed = "Labrador";

        Puppy puppy = new Puppy();
        puppy.Breed = "Labrador";
        puppy.color = "Black";
        puppy.name = "bruno";
        puppy.size = "32 in";

        puppy.run();*/

        /*rectangle rect = new rectangle();
        rect.length = 30;
        rect.breadth = 20;

        System.out.println("Length is: "+ rect.length);
        System.out.println("Breadth is: "+ rect.breadth);
        rect.getArea();
        rect.getPerimeter();*/

        //Parameterized constructor
        /*Cake cake1 = new Cake();

        cake1.setCakeName("Dutch Truffle");
        cake1.setPrice(20.0f);
        cake1.setFlavour("Dark Chocolate");

        System.out.println(cake1.getCakeName());
        System.out.println(cake1.getPrice());
        System.out.println(cake1.getFlavour());

        cake1.isAvailable();*/


        /*****************INHERITANCE*****************/



/*class Animal {

    String name;
    String color;

    public void run() {
        System.out.println("The Animal is running");
    }
}
class Dog extends Animal{
    String Breed;

}*/

/*class Puppy extends Dog{
    String size;
}*/
