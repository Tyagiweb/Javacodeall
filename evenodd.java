import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter number for check even ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        sc.close();


    }
}
