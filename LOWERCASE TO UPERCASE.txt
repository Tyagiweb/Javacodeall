import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        System.out.println("Enter charcter ");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("Upper case");
        }
        else{
            System.out.println("Not a uppercase");
        }
        sc.close();
    }
    
}
