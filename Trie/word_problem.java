package Trie;

public class word_problem {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        Node(){
            for (int i = 0; i < children.length; i++) {
                children[i]=null;
            }
        }

    } 
    public static Node root=new Node();
    public static void insert(String word) {
        Node curr=root;
        for (int j = 0; j < word.length(); j++) {
            int ch=word.charAt(j)-'a';
            if(curr.children[ch]==null){
                curr.children[ch]=new Node();
            }
            curr=curr.children[ch];
            
        }
        curr.eow=true;
    }
    public static boolean search(String s) {
        Node curr=root;
        for (int i = 0; i < s.length(); i++) {
            int ch=s.charAt(i)-'a';
            if(curr.children[ch]==null){
                return false;
            }
            curr=curr.children[ch];
        }
        return curr.eow;
    }
    public static boolean word_break(String s) {
        if(root==null){
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {//1 bec of substring 
            if(search(s.substring(0, i)) && word_break(s.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word[]={"i","like","samsung","sung"};
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        String s="";
        System.out.println(word_break(s));
    }
}
