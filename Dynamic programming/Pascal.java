import java.util.ArrayList;
import java.util.List;
//118
public class Pascal 
{
    static List<List<Integer>> generate(int n){
        List<List<Integer>> triangle=new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rownum=1;rownum<n;rownum++){
            List<Integer> row=new ArrayList<>();
            List<Integer> prevRowm=triangle.get(rownum-1);
            row.add(1);
            for(int colnum=1;colnum<=rownum;colnum++){
                row.add(prevRowm.get(colnum-1)+prevRowm.get(colnum));
                }

                row.add(1);
                triangle.add(row);
                


        }
       
        return triangle;
        
        


    }
    public static void main(String[] args) {
  
    
}

}
