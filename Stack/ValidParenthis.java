import java.util.HashMap;
import java.util.Stack;

public class ValidParenthis 
{
    static boolean isvalid(String s)
    {
       
        Stack<Character> st=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for(int i=0;i<s.length();i++)
        {
            char bracket=s.charAt(i);
            if(bracket=='(' || bracket=='{' || bracket=='[')
            {
                st.push(bracket);

            }
            else
            {
                char x=st.peek();
                if(map.get(x)==bracket)
                {
                    st.pop();

                }
                else
                return false;

            }

        }
        return true;
         


    }
    public static void main(String[] args) 
    {
        String str="([]})";
        boolean result= isvalid(str);
        System.out.println(result);
        
        
    }
    
}
