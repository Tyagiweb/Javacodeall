public class LongestCommonSequence {
    //LC-1143
//memorization
static int lcsmemorization(String a, String b,int m, int n,int dp[][]){
    if(m==0 || n ==0){
        return 0;
    }

    if(dp[m-1][n-1] !=0){
        return dp[m-1][n-1];
    }
    if(a.charAt(m-1)== b.charAt(n-1)){
        dp[m-1] [n-1] = 1+ lcsmemorization(a.substring(1), b.substring(1), m-1, n-1, dp);
    }
    else{
        dp[m-1][n-1] = Math.max(lcsmemorization(a, b, m-1, n, dp), lcsmemorization(a, b, m, n-1, dp));
    }
    return dp[m-1][n-1];
}
    

    //simple recusrion

    static int lcs(String first,String second)
    {
        if(first.length()==0 || second.length()==0){
            return 0;
        }
        int count=0;
        if(first.charAt(0)==second.charAt(0)){
            count=1+lcs(first.substring(1),second.substring(1));
        }
        else{
            int result_1=lcs(first.substring(1),second);
            int result_2=lcs(first,second.substring(1));
            count=Math.max(result_1,result_2);
        }
        return count;
        

    }

    //static int tabulazation

    static int tabulzation(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                    }
                    else if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp[i][j]=1+dp[i-1][j-1];
                        }
                        else{
                            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                        }
                    }
                }
            
            return dp[m][n];

    }
    public static void main(String[] args) {
        String first="ABCD";
        String second="ACBD";
        System.out.println(lcs(first,second));
    }
}
