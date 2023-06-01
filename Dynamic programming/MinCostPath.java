public class MinCostPath {
    //lc-64

    static int mincost(int cost[][],int m,int n){
        if(n<0 || m<0){
            return Integer.MAX_VALUE;
        }
        else if(m==0 && n==0){
            return cost[m][n];
        }
        else{
            return cost[m][n] +Math.min(Math.min(mincost(cost, m-1, n-1),mincost(cost, m-1, n)),mincost(cost, m, n-1));

        }
    }
    public static void main(String[] args) 

    {
        int arr[][]={{1,3,1},{1,5,1},{4,2,1}};
        int m=arr.length;
        int n=arr.length;
        int p=mincost(arr, 2, 2);
        System.out.println(p);
        
    }
    
}
