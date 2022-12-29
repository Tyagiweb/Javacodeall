public class ForDigit_Sum {
    public static void main(String[] args) {
        int a=2345;
        int count=0;
        for(int i=a;i!=0;i=i/10){
            count+=i%10;

        }
    }
    
}
