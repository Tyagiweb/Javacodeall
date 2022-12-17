import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter anu mumber");
        int a=scanner.nextInt();
        if(a%5==0){
            System.out.println("Number is divisible by 5");
        }
        else if(a%11==0){
            System.out.println("Number is divisisble by 11");
        }
        else{
            System.out.println("Number not divisble ");
        }


        scanner.close();

    }
    
}
