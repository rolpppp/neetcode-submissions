class Solution {
    public boolean hasDuplicate(int[] nums) {
        // input is an array of int
        // return boolean: true if the element appears more than once, false if otherwise

        // simple solution
        // idea is to check the element for every element
        // for (int i = 0; i < nums.length; i++){
        //     for (int j = i + 1; j < nums.length; j++){
        //         if (nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }

        // // [1, 2], [1, 3], [1, 4]
        // // [2, 3], [2, 3]
        // // [3, 3]
        // return false;

        // element, count
        Map<Integer, Integer> numCol = new HashMap<>();

        for (int num: nums){
            if (!numCol.containsKey(num)){
                numCol.put(num, 0);
            }else{
                return true;
            }
        }

        return false;
    }
}