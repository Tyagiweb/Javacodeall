public class Recusrion {

    static void row(int r,int c)
    {
        if(r==4){
            return;
        }
      
        col(r,c);
        System.out.println();

        row(r+1,c);

    }
    static void col(int r,int c){
        if(c==4){
            return;
        }
        if(c<=r){
        System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        col(r,c+1);

    }
    
  

    public static void main(String[] args) {
        row(1,1);
        
    }

}
