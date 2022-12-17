import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");
        int a=sc.nextInt();
        System.out.println("enter number");
        //int b=sc.nextInt();
        //int c
        switch(a%2){
       
            case 0:
            System.out.println("a is even number");
            break;
            case 1:
            System.out.println("b is odd number");
            break;
        }

        sc.close();
    }
    
}
