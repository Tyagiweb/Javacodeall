package Loops;

public class Armstrong {
    public static void main(String[] args) {
        int a=153;
        int arm=0;
        for(int i=a;i!=0;i=i/10){
            int r=i%10;
            arm+=r*r*r;

        }
        if(arm==a){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number not a armstrong");
        }
    }
    
}
