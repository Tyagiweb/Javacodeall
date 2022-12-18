package Strings;
import java.util.stream.*;
public class CapitalLeter {
    public static void main(String[] args) {
        String s1="Hello java Prashant";
        char s[]=s1.toCharArray();
        System.out.println(s);
        char s2=(char) s.length;
        System.out.println(s2);
        //System.out.println(String.utils.capitalize(s1));
        s1=s1.substring(0,1).toUpperCase()+s1.substring(1,s1.length()).toLowerCase();
        System.out.println(s1);
    }
    
}
