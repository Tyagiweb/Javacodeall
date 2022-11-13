import java.util.Scanner;

public class Salary 
{
    public static void main(String[] args)
     {
        System.out.println("Enter name ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        System.out.println(" Employees id ");
        int a=sc.nextInt();

        System.out.println(" Enter sallary ");
        int sal=sc.nextInt();

        System.out.println("Name of employeee is  "+name);

        float hra=(sal)*50/100f;
        System.out.println("HRA IS "+hra);
        float da=(sal)*10/100f;
        System.out.println("DA IS "+da);
        float ta=(sal)*40/100f;
        System.out.println("TA IS "+ta);
        float ma=(sal)*30/100f;
        System.out.println("MA IS "+ma);
        float pf=(sal)*5/100f;
        System.out.println("PF IS "+pf);
        float gs=sal+hra+da+ta+ma;
        float tx=(gs)*10/100;
        float ns=gs-tx;
        System.out.println("Gross salary is "+gs );
        System.out.println("tax is "+tx );
        System.out.println("ns  is "+ns );
        sc.close();
     }
    }









    

