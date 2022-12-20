public class RetrunDigit {

    static int digit(int num,int count){
        if(num==0){
            System.out.println(count);
            return count;
            
        }
        return digit(num/10,count+1);

    }

    public static void main(String[] args) {

        digit(8662553,0);
        
    }

   
    
}
