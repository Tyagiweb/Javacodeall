public class Pattern {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
    
        for(int i=1;i<=5;i++){
            int k=1;
        
            for(int j=1;j<=9;j++)
            {
                if(j>=5-i && j<=3+i){
                    System.out.print(k);
                    //(j<=4) ? (k++):(k--);
                    k+=(j<=4) ? (k++):(k--);
                    k-=(j>4)?k--:k++;
                

                }
                else{
                    System.out.print(" ");
                
                }
                
            }
            System.out.println(" ");
        }
        
    }
    
}
