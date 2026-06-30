import java.util.*;
public class palindromeString {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    String rev="";
     int len=name.length();
     for(int i=(len-1);i>=0;i--){
        rev=rev+ name.charAt(i);

     }
     if(name.toLowerCase().equals(rev.toLowerCase())){
        System.out.println(name+"IS PALINDROME");
     }
     else{
        System.out.println(name+"NOT PALINDROME");
     }
     sc.close();
   } 
}
