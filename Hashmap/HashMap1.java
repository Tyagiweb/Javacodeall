import java.util.HashMap;

public class HashMap1 {
    private static Object put;

    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("Prashant","Hello");
        map.put('P',"Hello1");
        map.put(2,"Java");
        map.put('P',"Hello1");
        map.put(2,"python");
        map.put("Nishant","Hello1");

        System.out.println(map);

    }
    
}
