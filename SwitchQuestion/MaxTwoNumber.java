import java.util.Scanner;

public class MaxTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        System.out.println("Enter 1 number");
        int  a=sc.nextInt();
        System.out.println("Enter 2 number");
        int b=sc.nextInt();
        int c=(a>b)?a:b;
        System.out.println(c);
       

        sc.close();

        
    }
    
}
