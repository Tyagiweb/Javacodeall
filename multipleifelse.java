import java.util.Scanner;

public class multipleifelse {
    //psvm
    public static void main(String[] args) {
        System.out.println("1.for drinks");
        System.out.println("2.for sweet");
        System.out.println("3.for snack");
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Your choice is drinks");
        }
        else if(choice==2){
            System.out.println("Your choice is sweets");
        }

        else if(choice==3){
            System.out.println("Your choice is snack");
        }
        else{
            System.out.println("Your choice wrong");
        }
        sc.close();



    }
}
