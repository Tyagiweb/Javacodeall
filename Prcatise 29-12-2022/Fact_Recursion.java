public class Fact_Recursion {
    static void show(int i,int fact){
        if(i>5){
            return;
        }
        fact+=fact*i;
        show(i+1,fact);
        System.out.println(fact);


    }
    public static void main(String[] args) {
        show(1,1);
        
    }
    
}
