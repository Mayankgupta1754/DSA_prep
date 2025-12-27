class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                if (counter > 0) {
                    result.append(c);
                }
                counter++;
            } else {
                counter--;
                if (counter > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
