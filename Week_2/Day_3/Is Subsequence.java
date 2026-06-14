class Solution {
    public boolean isSubsequence(String s, String t) {

        // two pointer approach

        int sn = s.length();
        int tn = t.length();

        if (sn > tn)
            return false;
        if (sn == 0)
            return true;

        int i = 0;
        int j = 0;

        while (i < sn && j < tn) {
            Character sc = s.charAt(i);
            Character tc = t.charAt(j);

            if (sc.equals(tc)) {
                i++;
            }
            j++;

            if (i == sn) {
                return true;
            }

        }
        return false;
    }
}