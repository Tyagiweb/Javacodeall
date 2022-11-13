import java.util.Scanner;

public class marksheet 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of student ");
        String name=sc.nextLine();
        System.out.println("Enter roll number");
        int roll=sc.nextInt();
        System.out.println("Enter 1 subject marks");
        int sub1=sc.nextInt();
        System.out.println("Enter 2 subject marks");
        int sub2=sc.nextInt();
        System.out.println("Enter 3 subject marks");
        int sub3=sc.nextInt();

        int total=sub1+sub2+sub3;
        float average=(total)*100/300f;
        System.out.println("Name of student is "+name);
        System.out.println("Roll_number of student is "+roll);
        System.out.println("Total_number of "+name+" is "+total);
        System.out.println("Average_number of "+name+" is "+average);
        if(average>90)
        {
            System.out.println("A grade");
        }
        else if(average>90)
        {
            System.out.println("A grade");
        }
        else if(average>80 && average<90)
        {
            System.out.println("B grade");
        }
        else if(average>70 && average<80)
        {
            System.out.println("C grade");

        }
        else
        {
            System.out.println("Fail");
        }
        sc.close();
        }
    }










        

    
