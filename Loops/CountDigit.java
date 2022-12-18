package Loops;
//import java.math.*;
public class CountDigit {
    public static void main(String[] args) {
        int count=0;
        int a=876564;
        int last;
        int first=a;
        for(int i=a;i!=0;i=i/10){
            count++;
        }
        System.out.println(count);
        last=876564%10;
        
        while(first>=10){
            first=first/10;
        }
        System.out.println(last);
        System.out.println(first);
        
       
        
        
        
    }
    
}
