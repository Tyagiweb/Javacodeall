import java.util.Scanner;
public class MaxThreeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 number");
        int firstnum=sc.nextInt();
        System.out.println("Enter 2 number");
        int secondnum=sc.nextInt();
        System.out.println("Enter 3 number");
        int thirdnum=sc.nextInt();
        if(firstnum>secondnum && firstnum>thirdnum)
        {
            System.out.println(firstnum+" is grater than "+secondnum +" or "+ thirdnum);
        }
        else if( secondnum>firstnum && secondnum>thirdnum){
            System.out.println(secondnum +" is grater than first and third");

        }
        else{
            System.out.println("Third number is grater than all");
        }

        sc.close();

    }
    
}
