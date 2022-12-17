import java.util.Scanner;

public class Weeks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter weeks days");
        int a=sc.nextInt();
        switch(a){
            case 1:System.out.println("Sunday");
            break;
            case 2:System.out.println("MON");
            break;
            case 3:System.out.println("TUES");
            break;
            case 4:System.out.println("WED");
            break;
            case 5:System.out.println("THURS");
            break;
            case 6:System.out.println("FRI");
            break;
            case 7:System.out.println("SAT");
            break;
            default:System.out.println("Not a week");
                }



        sc.close();


    }
}