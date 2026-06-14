class Solution {
    public int strStr(String haystack, String needle) {
        // brute , with use of library functions...

        // if(haystack.contains(needle)){
        // return haystack.indexOf(needle);

        // }
        // return -1;

        // optimal , check substring ..

        int n = needle.length();
        int h = haystack.length();

        if (n == 0)
            return -1;
        if (n == 1 && h == 1)
            return 0;

        for (int i = 0; i <= h - n; i++) {
            String sub = haystack.substring(i, i + n);
            if (sub.equals(needle)) {
                return i;
            }

        }
        return -1;

    }
}