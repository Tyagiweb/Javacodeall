public class DigitCountRecursion {
    static int show(int num,int digit){
        if(num==0){
            return digit;
        }
        digit++;

        return show(num/10,digit);

    }
    public static void main(String[] args) {
        int a=show(12345,0);
        System.out.println(a);
    }
    
}
