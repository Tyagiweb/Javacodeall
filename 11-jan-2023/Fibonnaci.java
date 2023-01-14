public class Fibonnaci {
    public static void main(String[] args) {
        int num=5;
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a);
        for(int i=0;i<=num;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(c);
        }
    }
    
}
