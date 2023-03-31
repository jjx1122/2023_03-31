import java.util.HashSet;
import java.util.Set;

public class maxSonStr {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, ans = 0;

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i); // 更新最长子串长度
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String s= new String("aabcdddss");
        int n=lengthOfLongestSubstring(s);
        System.out.println(n);
    }

}
