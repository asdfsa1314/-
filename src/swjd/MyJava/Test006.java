package swjd.MyJava;

public class Test006 {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++ )
                s3 = (s2.charAt(j)+s3);

        }
    }
}
