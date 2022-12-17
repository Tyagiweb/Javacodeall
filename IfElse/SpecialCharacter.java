import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter any one");

        char c=sc.next().charAt(0);
        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
        {
            System.out.println("character");
        }
        else if (c>='0' && c<='9'){
            System.out.println("Digit");

        }
        else{
            System.out.println("Special chacter");
        }
        sc.close();
    }

        
        
}
    

