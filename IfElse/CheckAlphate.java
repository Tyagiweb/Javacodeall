import java.util.Scanner;

public class CheckAlphate {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit or charcter");
        char b=(sc.nextLine().charAt(0));

        if((b>='A' && b<='Z')){
            System.out.println("upercase Character");
        }
        else if (b>='0' && b<='9'){
            System.out.println("Lower case");
        }
       

        sc.close();

    }

}

    

