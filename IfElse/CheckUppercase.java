import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;
public class CheckUppercase {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any character");
        char c=sc.nextLine().charAt(0);
        if(c>'A' && c<'Z')
        {
            System.out.println("LARGE CHARCTER");
        }
       else if(c>='0' && c<='9')
       {
        System.out.println("Input is small  digit");
       }
       else
       {
        System.out.println("Not a both");
       }
       sc.close();
    }
}


        
    
    

