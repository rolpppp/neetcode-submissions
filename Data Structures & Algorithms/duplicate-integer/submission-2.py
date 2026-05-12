class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # input of list of int
        # we are to return a boolean: true if any value appears > 1, false if otherwise

        # simple solution: check if an element exists in the array by for loop
        numCol = {}
        for num in nums:
            if numCol.get(num) is None:
                numCol[num] = 1
            else:
                return True
        return False