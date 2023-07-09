package strings;

import java.util.Arrays;

// An anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once. For example, the word anagram itself can be rearranged into nag a ram, as well as the word binary into brainy and the word adobe into abode
public class anagrams {
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
