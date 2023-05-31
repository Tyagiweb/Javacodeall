public class ClimbingStair {
    //LC-70
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

    static int tabulzation(int n){
        int cache[]=new int[n+1];
        cache[0]=1;
        cache[1]=1;
        cache[2]=2;
        for(int i=3;i<=n;i++){
            cache[i]=cache[i-1]+cache[i-2];
            }
            return cache[n];
            }
    

    public static void main(String[] args) {
        int res=climbStair(4);
        System.out.println(res);



        
    }
    
}
