/* 
 * *****
 * ****
 * ***
 * **
 * *
 * 
*/


public class PrintPattern{

    static void col(int col){
        if(col==0){
            return;
        }
        System.out.print("*");
        col(col-1);
    }

    static void show(int row,int col){
        if(col==0){
            return;

        }
       // System.out.print("*");
        col(col);
        System.out.println();


        show(row-1,col-1);
        
    }
    public static void main(String[] args) {

        show(5,5);
        
    }
}