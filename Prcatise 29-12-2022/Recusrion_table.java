public class Recusrion_table {
    static void show(int i){
        if(i>=10){
            return;
        }
        System.out.println(2*i);
        show(i+1);

    }
    public static void main(String[] args) {
        show(1);
    }
    
}
