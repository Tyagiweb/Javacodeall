import java.util.Scanner;
public class Month 
{
    public static void main(String[] args) {
        System.out.println("Enter month name for days  ");
        Scanner sc=new Scanner(System.in);
        String y=sc.nextLine();
        if(y=="JANUARY" || y=="MARCH" || y=="MAY" || y=="JULY" || y=="AUGUST" || y=="OCTOBER" || y=="DECEMBER")
        {
            System.out.println("Month is January and days is 31");
        }
        else if (y=="FEBRUARY")
        {
            System.out.println("Month is february and day is 28 ");
        }
        else
        {
            System.out.println("Month is "+y+" and day is 30 ");
        }
        sc.close();
    }
      



        

    
    
}
