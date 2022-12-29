public class DigitSum_recursion {
    static int show(int digit,int count){
        if(digit==0){
            return count;
        }
        count+=digit%10;
        return show(digit/10,count);

    }
    public static void main(String[] args) {
        int a=show(12345,0);
        System.out.println(a);
        
    }
    
}
