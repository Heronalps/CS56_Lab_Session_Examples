public class Anagram {
    public boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
           return false;
        }
        
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[(int) s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[(int) t.charAt(i)]--;
            if (count[(int) t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
