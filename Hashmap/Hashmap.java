import java.util.HashMap;
import java.util.Scanner;

public class Hashmap{
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name to checkhow many times that appear");
        String s=sc.nextLine();

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char singleChar=s.charAt(i);
            if(singleChar==' '){
                continue;
            }
            if(map.get(singleChar)==null)
            {
                map.put(singleChar,1);

            }
            else{
                int prevCount=map.get(singleChar);
                map.put(singleChar,prevCount+1);
            }
        }

        System.out.println(map);


        sc.close();
        
    }
}
