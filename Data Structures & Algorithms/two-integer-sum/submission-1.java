class Solution {
    public int[] twoSum(int[] nums, int target) {
        // inputs are int[] and an int 
        // output indices s.t. it equals to the target 
        // small index first

        // brute force
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = count(i); j < nums.length; j++){
                if (i == j){
                    j++;
                }

                if (nums[i] + nums[j] == target){
                    if (i < j){
                        result[0] = i;
                        result[1] = j;
                    }else{
                        result[0] = j;
                        result[1] = i;
                    }
                    return result;
                }
            }
        }
        return null;
    }

    private static int count(int i){
        if (i == 0){
            return i + 1;
        }else{
            return 0;
        }
    }
}
