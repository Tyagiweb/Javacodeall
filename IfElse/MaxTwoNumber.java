import java.util.Scanner;
public class MaxTwoNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 number");
        int firstnum=sc.nextInt();
        System.out.println("Enter 2 number");
        int secondnum=sc.nextInt();
        if(firstnum>secondnum){
            System.out.println(firstnum+" is grater than "+secondnum);
        }
        else{
            System.out.println(secondnum+" is grater than "+firstnum);

        }
        sc.close();
    }
}