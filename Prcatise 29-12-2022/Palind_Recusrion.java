public class Palind_Recusrion {
    static int show(int a,int palind){
        if(a==0){
            return palind;
        }
        int r=a%10;
        int rev=(palind*10)+r;


        return show(a/10,rev);

    }

    public static void main(String[] args) {
        int c=show(123,0);
        if(c==123)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }
    
}
