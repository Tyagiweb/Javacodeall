public class MultiRecursion{

    static void show(int n){
        if(n>3){
            return;
        }
       
        System.out.println(n);
        show(n+1);
        show(n+2);
        
    }
    public static void main(String[] args) {
        show(0);
        

        
    }
}