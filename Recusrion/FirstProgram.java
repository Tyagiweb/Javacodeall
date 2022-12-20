public class FirstProgram{

    static void show(int num){
        if(num>5){
            return;
        }
        System.out.println("Prashant");
        show(num+1);
        System.out.println("Harish");

    }


    public static void main(String[] args) {
        show(1);
        System.out.println("Main");
        
    }
}