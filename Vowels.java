import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        System.out.println("Enter Vowels or constant");
        Scanner sc=new Scanner(System.in);
        char y=sc.next().charAt(0);
        if(y=='a' || y=='e' || y=='i' || y=='o' || y=='u' || y=='A' || y=='E' || y=='I' || y=='O' || y=='U'){
            System.out.println("cHARACTER IS VOWELS  "+y);
        }
        else{
            System.out.println("not a constant");
        }

        sc.close();


    }

    
}
