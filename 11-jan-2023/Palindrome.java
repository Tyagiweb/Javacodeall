public class Palindrome {
    public static void main(String[] args) {
        int a=121;
        int sum=0;
        for(int i=a;i!=0;i=i/10)
        {
            int rem=i%10;
            sum=(sum*10)+rem;

        }
        System.out.println(sum);
        
    
    if(a==sum){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("not a palindorme");
    }
    
}
}
