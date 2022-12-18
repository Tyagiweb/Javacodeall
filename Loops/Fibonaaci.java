package Loops;

public class Fibonaaci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=5;i++){
            a=b;
            b=c;
            c=a+b;
          
            System.out.print(c);

        }
    }
    
}
