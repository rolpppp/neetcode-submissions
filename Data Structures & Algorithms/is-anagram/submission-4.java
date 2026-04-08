class Solution {
    public boolean isAnagram(String s, String t) {
        // inputs are two (2) strings - (ask if lowercase, uppercase, or mixed)
        // return a boolean: true if two strings are anagrams

        // anagram - strings that contain the exact same characters

        // brute force: loop through each characters string

        // edge cases

        // if strings are not of the same length
        if (s.length() != t.length()){
            return false;
        }


        // we introduce a flag
        boolean isSame = false;

        // sort both first
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray(); 

        Arrays.sort(charsS);
        Arrays.sort(charsT);

        for (int i = 0; i < s.length(); i++){
            if (charsS[i] == charsT[i]){
                isSame = true;
            }else{
                return false;
            }
        }

        return isSame;
    }
}
