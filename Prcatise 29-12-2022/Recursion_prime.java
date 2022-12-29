public class Recursion_prime 
{
    static int show(int i,int a,int count )
    {
        if(a<=i)
        {
            return count;
        }
        if(a%i==0)
        {
            count++;
        }
        return show(i+1,a,count);
        
       
        

    }
    

    public static void main(String[] args) {
        int c=show(1,12,0);
        if(c==1){
            System.out.println("prime number");
        }
        else{
            System.out.println("not Prime number");
        }

        
    }
    
}
