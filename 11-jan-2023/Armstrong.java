public class Armstrong {
    public static void main(String[] args) {
        int a=163;
        int sum=0;
        for(int i=a;i!=0;i=i/10){
            int r=i%10;
            sum=sum+(r*r*r);
        }
        System.out.println(sum);
        
    }
    
}
