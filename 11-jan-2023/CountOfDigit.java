public class CountOfDigit {
    public static void main(String[] args) {
        int a=12349876;
        int count=0;
        for(int i=a;i!=0;i=i/10){
            count=count+1;
        }
        System.out.println(count);
        

        
    }
    
}
