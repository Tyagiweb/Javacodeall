import java.util.Scanner;

public class Age {
    //mevel
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligble for license");
        }
        else{
            System.out.println("Not eligble");
        }
        sc.close();
    }
}
