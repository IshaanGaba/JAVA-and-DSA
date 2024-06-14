package strings;

import java.util.Arrays;

// An anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once. For example, the word anagram itself can be rearranged into nag a ram, as well as the word binary into brainy and the word adobe into abode
public class anagrams {
    // ---------------good approach-----------------------
    public static boolean goodapproach(String s, String s1) {
        if (s.length()!=s1.length()) {
            return false;
        }
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']--;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                return false;
            }
        }
        return true;
    
    }
    public static int anagram(String s, String d) {
        if(s.length()!=d.length()){
            return -1; 
        }
        // s=s.toLowerCase();
        // d=d.toLowerCase();
        char sa[]=s.toCharArray();
        char da[]=d.toCharArray();
        // System.out.println("yes");
        Arrays.sort(sa);
        Arrays.sort(da);
        System.out.println(sa);
        System.out.println(da);
        boolean result=Arrays.equals(sa,da);
        if(result){
            return 1;
        }
        return -1;

    }
    public static void main(String[] args) {
        String s="name";
        String d="Naem";
        System.out.println(anagram(s, d));
        

    }
    
}
