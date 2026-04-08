class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        HashMap<Character, Character> pairs = new HashMap<Character, Character>();

        // input key, value pair in pairs
        pairs.put('}', '{');
        pairs.put(')', '(');
        pairs.put(']', '[');

        // iterates through the string
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            // we push every opening parenthesis 
            if (stack.contains(pairs.get(c))){
                if (pairs.get(c) == stack.peek()){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }

        if (stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    // [ 2: 
}
