public class Recursion {
    static void show(int n){
        if(n>=5){
            return;

        }
        System.out.println("Hello");
        show(n+1);

    }
    
    public static void main(String[] args) {
        show(1);
    
}
    
}
