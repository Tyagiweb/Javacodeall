public class Tabulation {
    static int reccount=0;
    static int memocount=0;
    static int tabulation=0;
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

    static int Tabulatio(int n){
        tabulation++;
        
        if(n==0 || n==1){
            return n;
        }
        int tab[]=new int[n+1];
        tab[0]=0;
        tab[1]=1;
        for(int i=2;i<=n;i++){
            tab[i]=tab[i-1]+tab[i-2];
            }
            return tab[n];
            }

      


    


    public static void main(String[] args) {

        int n=10;
        int cache[]=new int[n+1];
        int res=fib(n);
        System.out.println(res);
        res=memorization(n,cache);
        System.out.println(res);

        System.out.println("Rec count is "+reccount);
        System.out.println("mem count is "+memocount);

        res=Tabulatio(5);
        System.out.println(res);
        System.out.println("Tabulation coutn is "+tabulation);

        
    }
    
}
