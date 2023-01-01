public class StairClimb {
    static int climbStair(int n){
        if(n==1 || n==0){
            System.out.println(n);
            return 1;
        }
        else if(n==2){
            System.out.println(n);
            return 2;
        }
        else{
            System.out.println(n);
           int x=climbStair(n-2);
           int y=climbStair(n-1);
           return x+y;

        }
        

    }


    public static void main(String[] args) {
        int res=climbStair(4);
        System.out.println(res);
    }

    
}
