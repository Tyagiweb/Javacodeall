import java.util.Scanner;
public class FirstCapital{
    public static void main(String[] args) {
        //String arr[]={" This ","pRraShan","hEllo"};
        //for( String i:arr){
          //  System.out.println(i);
        
        //so

        //String arr2[]=arr.split(" ");

        
        //}
        System.out.println("Enter name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        String nameArr[]=name.split(" ");
        System.out.println(nameArr);
        String full_name="";
        for(String word:nameArr){
            System.out.println(word);
            String n=String.valueOf(word.charAt(0)).toUpperCase()+String.valueOf(word.substring(1)).toLowerCase();
            System.out.println(n);
            full_name=full_name+n+" ";



        }
        System.out.println(full_name);





        sc.close();

        
       
    }
}