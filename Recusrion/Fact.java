public class Fact {
    static void show(int num,int result){

        if(num>5){
            return;
        }
        result=result*num;

        show(num+1,result);




    }

    public static void main(String[] args) {

        show(1,1);
        
    }
    
}
