package Problems.longest_substring_without_repeating_characters.approach1;

public class approach1 {

    static boolean ifExists(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }

        return false;
    }

    static int checkLongestSubstring(String str) {
        String wannaBe = "";
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            wannaBe = wannaBe + str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {
                boolean response = ifExists(wannaBe, str.charAt(j));
                if (response) {
                    break;
                }
                wannaBe = wannaBe + str.charAt(j);
            }
            maxLength = Math.max(maxLength, wannaBe.length());
            wannaBe = "";
        }
        return maxLength;
    }

    public static void main(String args[]) {
        String input = "abcabcbb";
        int result = checkLongestSubstring(input);

        System.out.println(result);
    }

}
