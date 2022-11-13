import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        System.out.println("Enter year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("Year is leap");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }

    
}
