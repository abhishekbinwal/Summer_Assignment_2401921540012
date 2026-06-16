class Solution {
    public int compress(char[] chars) {
        // optimal , two pointer , in place
        int read = 0;
        int write = 0;

        while (read < chars.length) {

            int count = 0;
            char curr = chars[read];

            while (read < chars.length && chars[read] == curr) {
                count++;
                read++;
            }

            chars[write++] = curr;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }

            }

        }
        return write;

    }
}