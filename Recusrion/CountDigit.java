public class CountDigit {
    static void digit(int num,int num1){
        if(num==0){
            System.out.println(num1);
            return;
        }


        digit(num/10,num1+1);



    }

    public static void main(String[] args) {
        digit(765432,0);
    }
    
}
