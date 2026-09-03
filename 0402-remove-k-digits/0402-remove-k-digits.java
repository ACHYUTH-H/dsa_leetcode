class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (k >= n) return "0"; // Removing all digits leaves 0

        StringBuilder sb = new StringBuilder();

        for (char c : num.toCharArray()) {
            // Drop larger previous digits while we still have removals (k > 0)
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && k > 0) {
                sb.deleteCharAt(sb.length() - 1); // equivalent to stack.pop()
                k--;
            }
            sb.append(c); // equivalent to stack.push()
        }

        // If k > 0 remains (e.g., num = "12345"), drop from the end
        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeroes
        int startIndex = 0;
        while (startIndex < sb.length() && sb.charAt(startIndex) == '0') {
            startIndex++;
        }

        String result = sb.substring(startIndex);

        // If result is empty after stripping zeroes, return "0"
        return result.isEmpty() ? "0" : result;
    }
}