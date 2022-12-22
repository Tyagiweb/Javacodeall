public class PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<100;i++){
            if(i%2!=0){
                if(i%i==0){
                    for(int j=1;j<=i;j++){
                        if(i%j==0){
                            count++;
                        }
                        if(count>1){
                            System.out.println(i);
                        }
                    }


                    System.out.println(i);
            }
           
            }

        }
    }
    
}
