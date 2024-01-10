package Stack;
import java.util.*;
public class unixpath {

    public static String simplifyPath(String path) {
        StringBuilder res = new StringBuilder();
        Stack<String> s = new Stack<>();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/') {
                continue;
            }
            String temp = "";
            while (i < path.length() && path.charAt(i) != '/') {
                temp = temp + path.charAt(i);
                i++;
            }
            if (temp.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else if (temp.equals(".")) {
                continue;
            } else {
                s.push(temp);
            }
        }

        while (!s.isEmpty()) {
            res.insert(0, s.pop());
            res.insert(0, "/");
        }
        if (res.length() == 0) {
            return "/";
        }
        return res.toString();

    }
    public static void main(String[] args) {
        String s="/../home//foo/";
        System.out.println(simplifyPath(s));
    }
}
