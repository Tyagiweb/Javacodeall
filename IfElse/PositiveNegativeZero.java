//import java.net.SocketTimeoutException;
import java.util.Scanner;

public class PositiveNegativeZero 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number");
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.println("Number is postive");
        }
        else if(a<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }


        sc.close();
    }
}
    

