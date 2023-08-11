package Trie;

public class search {
    static class Node{
        Node children[]=new Node[26];
        boolean eow;
        Node(){
            for (int i = 0; i < children.length; i++) {
                children[i]=null;
            }
            eow=false;
        }
    }
    public static Node root=new Node();
    public static void insert_trie(String s) {
        Node curr=root;
        for (int i = 0; i < s.length(); i++) {
            int ch=s.charAt(i)-'a';
            if(curr.children[ch]==null){
                curr.children[ch]=new Node();
            }
            curr=curr.children[ch];
        }
        curr.eow=true;
    }
    public static boolean srch(String s) {
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
    public static void main(String[] args) {
        String words[]={"the","their","a","any","there"};
        for (int i = 0; i < words.length; i++) {
            insert_trie(words[i]);
        }
        System.out.println(srch("their"));
    }
}
