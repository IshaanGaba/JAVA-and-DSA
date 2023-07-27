package Queue;

import java.util.*;

public class non_first_repetive{
    public static void non(String str) {
            Queue<Character> q=new LinkedList<>();
            int freq[]=new int[26];

            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);//aabccxb
                q.add(ch);
                freq[ch-'a']++;
                while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                    q.remove();
                }
                if(q.isEmpty()){
                    System.out.println("-1" + " ");
                }
                else{
                    System.out.println(q.peek()+" ");
                }
            }
    
    }
    public static void main(String[] args) {
        String str="aabccxb";
        non(str);
    }
}