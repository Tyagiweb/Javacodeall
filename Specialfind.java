import java.util.Scanner;

public class Specialfind {
    public static void main(String[] args) {
        System.out.println("Enter character");
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);
        if((ch>'a' && ch<'z')||(ch>'A' && ch<'Z'))
        {
            System.out.println("Input is charcter");

        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Input charcter is digit");
        }
        else{
            System.out.println("Input is character");
        }


        sc.close();
    }
    
}
