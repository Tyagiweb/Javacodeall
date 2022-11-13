import java.util.Scanner;

public class two{
    public static void main(String[] args) {
        //which number is greater

        System.out.println("Enter 1 number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter 2 number");
        //Scanner sc=new Scanner(System.in);
        int num2=sc.nextInt();
        if(num>num2){
            System.out.println("Enter 1 number is greater");
        }
        else{
            System.out.println("Enter 2 number is grater");
        }
        sc.close();
        

    }
} 

