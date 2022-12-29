public class Palindrome_For {
    public static void main(String[] args) {
        int a=121;
        int palin=0;
        for(int i=a;i!=0;i=i/10){
            int r=i%10;
            palin=(palin*10)+r;
        }
        
    }
    
}
