// class Solution {
//     public int lengthOfLongestSubstring(String s) {

//    // brute , HashSet + 2 loops

//         int n=s.length();
//         if(n==0) return 0;
//         int maxAll=Integer.MIN_VALUE;

//         for(int i =0 ;i<n ;i++){
//             HashSet<Character> set = new HashSet<>();
//             int length=0;
//             int max=Integer.MIN_VALUE;
//             for(int j=i ;j<n ;j++){
//                 if(set.contains(s.charAt(j))){
//                     break;
//                 }
//                 else{
//                     length++;
//                     set.add(s.charAt(j));
//                 }

//             }
//             max=Math.max(max,length);
//             maxAll = Math.max(maxAll,max);
//         }

//         return maxAll;

//     }
// }

// /// // // OPTIMAL , SLIding window + hashset

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        if (n == 0)
            return 0;
        int maxAll = Integer.MIN_VALUE;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxAll = Math.max(maxAll, i - left + 1);

        }
        return maxAll;
    }
}
