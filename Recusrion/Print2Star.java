public class Print2Star {

    static void col(int col,int row){
        if(col==row){
            return;
        }
        System.out.print("*");

        col(col,row);

    }

    static void show(int row,int col){
        if(col==6){
            return;
        }
        col(col,row);
        System.out.println();
       

        show(row+1,col+1);

    }
    public static void main(String[] args) {
        show(5,1);
    }
    
}
