class Solution {
    public String decodeString(String s) {
        Stack<Integer> nstack = new Stack<>();
        Stack<StringBuilder> sstack = new Stack<>();

        int num = 0;
        StringBuilder curr = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                sstack.push(curr);
                nstack.push(num);
                num = 0;
                curr = new StringBuilder();
            } else if (c == ']') {
                int numRepeat = nstack.pop();
                StringBuilder str = sstack.pop();

                for (int i = 0; i < numRepeat; i++) {
                    str.append(curr);
                }
                curr = str;
            } else {
                curr.append(c);
            }
        }
        return curr.toString();

    }
}