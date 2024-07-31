package Trie;
public class prefix_problem {
    static class Node{
        Node[] children=new Node[26];
        boolean eow;
        int freq;
        public Node(){
            eow=false;
            for (int i = 0; i < children.length; i++) {
                children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node();
    public static void insert(String word) {
        Node curr=root;
        
        for (int i=0; i < word.length(); i++) {
            int indx=word.charAt(i)-'a';
            if(curr.children[indx]==null){
                curr.children[indx]=new Node();
            }else{
                curr.children[indx].freq++;
            }
            curr=curr.children[indx];
        }
        curr.eow=true;
    }
    public static String search(String w) {
        Node curr=root;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < w.length(); i++) {
            int indx=w.charAt(i)-'a';
            sb.append(w.charAt(i));
            if(curr.children[indx].freq==1){
                return sb.toString();
            }
            curr=curr.children[indx];
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String words[]={"zebra","dog","duck","done","dove"};
        String ans[]=new String[words.length];
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            ans[i]=search(words[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}
