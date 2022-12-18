package Loops;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        int a=123;
        int temp=a;
        int rev=0;
        for(int i=a;i!=0;i=i/10)
        {
            int r=i%10;
            rev=(rev*10)+r;

        }
        
    
    if(rev==a)
    {
        System.out.println("Palindrom");
    }
    else
    {
        System.out.println("Not a palindrome");
    }

    }
    
}
