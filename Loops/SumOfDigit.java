package Loops;

public class SumOfDigit {
    public static void main(String[] args) {
        int a=12345;
        int sum=0;
        for(int i=a;i!=0;i=i/10){
            int c=i%10;
            sum=sum+c;
        }
        System.out.println(sum);
    }
    
}
