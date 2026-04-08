class Solution {
    public boolean isPalindrome(String s) {

        // we first clean the string: remove " " and change to lowercase
        // added a regex to remove !alphanumeric
        // String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // brute force: reverse a string and check if equal to original string
        // StringBuilder sb = new StringBuilder(cleanedString);

        // return cleanedString.equals(sb.reverse().toString());

        // we use two indices [start, end] to act as two pointer

        boolean isSame = false;

        // clean the string
        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        // edge case
        if (cleanedString.length() < 2){
            return true;
        }
        for (int i = 0; i < (cleanedString.length() / 2); i++){
            int first = i;
            int end = (cleanedString.length() - 1) - i;

            if (cleanedString.charAt(first) == cleanedString.charAt(end)){
                isSame = true;
            }else{
                return false;
            }
        }

        return isSame;
    }
}
