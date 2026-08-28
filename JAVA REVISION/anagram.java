public class anagram {
    public static void main(String[] args) {
        String s="listen";
        String s1="silent";

        if(s.length()!=s1.length()){
            System.out.println("not a anagram");
        }
        int[] charcount =new int[26];
        for(int i=0;i<s.length()-1;i++){
            charcount[s.charAt(i)-'a']++;
            charcount[s1.charAt(i)-'a']--;
        }
        for(int i=0;i<charcount.length;i++){
            int count=charcount[i];
            if(count!=0){
                System.out.println("NOT A ANAGRAM");
                return;
            }
                System.out.println("IT IS A ANAGRAM");
            }
        }
    }
