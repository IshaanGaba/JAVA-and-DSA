public class telephone {
    public static void connect(String digit, String mapping[], StringBuilder ans, int i) {
        if (digit == "") {
            System.out.println(ans);
            return;
        }
        if (i >= digit.length()) {
            System.out.println(ans);
            return;
        }
        int number=digit.charAt(i)-'0';
        String value=mapping[number];
        for (int j = 0; j < value.length(); j++) {
            connect(digit, mapping, ans.append(value.charAt(j)), i+1);
            ans.deleteCharAt(i);
        }

    }

    public static void main(String[] args) {
        String digit = "23";
        String mapping[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        connect(digit, mapping, new StringBuilder(""), 0);
    }
}
