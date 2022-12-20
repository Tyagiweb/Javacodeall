public class TablePrint {

    static void show(int num){

        if(num>20){
            return;
        }
        System.out.println(num);


        show(num+2);
        System.out.println(num+1);

    }
    public static void main(String[] args) {

        show(2);
        
    }
    
}
