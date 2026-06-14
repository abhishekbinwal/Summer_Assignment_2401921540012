class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // similiar to finding anagrams 

        // OPTIMAL , HashMap/Array +  Sliding Window ..
        if (s2.length() < s1.length()) return false;

        int[] sone = new int[26];
        int[] stwo = new int[26];

        for(char c: s1.toCharArray()){
            sone[c-'a']++;
        }

        for(int i=0 ;i<s1.length() ; i++){
            stwo[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(sone , stwo)){
            return true;
        }

        // SLIDE WINDOW
        for(int i=s1.length() ; i<s2.length() ;i++){
            stwo[s2.charAt(i) - 'a']++;
            stwo[s2.charAt(i - s1.length()) - 'a']--;

            if(Arrays.equals(sone , stwo)){
                return true;
            }

        } 
        return false;
        
    }
}