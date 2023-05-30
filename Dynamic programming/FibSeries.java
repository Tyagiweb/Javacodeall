public class FibSeries
{
    static int reccount=0;
    static int memocount=0;
    static int fib(int n){
        reccount++;
        if(n==0 || n==1){
            return n;
        }
        int first=fib(n-1);
        int second=fib(n-2);
        int result=first+second;
        return result;
    }
    static int memorization(int n,int cache[]){
        memocount++;
        if(n==0 || n==1){
            return n;
        }
        if(cache[n]!=0){
            return cache[n];
        }
        int first=memorization(n-1,cache);
        int second=memorization(n-2,cache);
        int result=first+second;
        cache[n]=result;
        return cache[n];


    }


    public static void main(String[] args) {

        int n=5;
        int cache[]=new int[n+1];
        int res=fib(n);
        System.out.println(res);
        res=memorization(n,cache);
        System.out.println(res);

        System.out.println("Rec count is "+reccount);
        System.out.println("mem count is "+memocount);
        
    }

}