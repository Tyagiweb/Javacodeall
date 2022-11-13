import java.util.Scanner;
public class Productprice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price");
        int cost=sc.nextInt();
        System.out.println("Enter Selling price");
        int sell=sc.nextInt();
        int total=sell-cost;
        if(total>=0){
            System.out.println("You are in  profit "+total);
        }
        else{
            System.out.println("You are in lose "+total);
        }
        sc.close();

    }

}
    

