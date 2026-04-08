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
        // boolean isSame = false;

        // sort both first
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray(); 

        // Arrays.sort(charsS);
        // Arrays.sort(charsT);

        // for (int i = 0; i < s.length(); i++){
        //     if (charsS[i] == charsT[i]){
        //         isSame = true;
        //     }else{
        //         return false;
        //     }
        // }

        // return isSame;

        /*
            {
                char: 
                freq: 
            }

            {[a: 3]}
            {[a: 2]}
        */  
        Map<Character, Integer> charCol1= new HashMap<>();
        Map<Character, Integer> charCol2= new HashMap<>();

        for (char letter: charsS){
            if (!charCol1.containsKey(letter)){
                charCol1.put(letter, 0);
            }else{
                charCol1.put(letter, charCol1.get(letter) + 1);
            }
        }

        for (char letter: charsT){
            if (!charCol2.containsKey(letter)){
                charCol2.put(letter, 0);
            }else{
                charCol2.put(letter, charCol2.get(letter) + 1);
            }
        }
        
        return charCol1.equals(charCol2);
    }

}
