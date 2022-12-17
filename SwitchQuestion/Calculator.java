import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 number");
        int a =sc.nextInt();
        System.out.println("Enter 2 number");
        int b=sc.nextInt();
        System.out.println("Enter opertaor");
        char c=sc.next().charAt(0);
        switch(c){
            case '+':
            
            System.out.println(a+b);
            break;
            case '*': 
            System.out.println(a*b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            default:
            System.out.println("Enter right choice");
        }



        sc.close();

        
    }

    
}
