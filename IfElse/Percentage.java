import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1 subject marks");
        int a=sc.nextInt();
        System.out.println("Enter 2 subject marks");
        int b=sc.nextInt();
        System.out.println("Enter 3 subject marks");
        int c=sc.nextInt();
        int d=a+b+c;
        float f=(d*100)/300;
        if(f>90){
            System.out.println("Topper of class");
            System.out.println(" Percentage is "+f);
            System.out.println(" Total amount is "+d);
        }
        else if(f>80 && f<90){
            System.out.println("2 nd Topper of class");
            System.out.println(" Percentage is "+f);
            System.out.println(" Total amount is "+d);

        }
        else {
            System.out.println("3 nd Topper of class and fail");
            System.out.println(" Percentage is "+f);
            System.out.println(" Total amount is "+d);
            
        }
        sc.close();
        
    }
    
}
