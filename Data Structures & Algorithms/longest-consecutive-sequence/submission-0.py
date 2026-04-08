class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        # we introduce a set to store elements
        setNums = set(nums)
        max_count = 0

        # idea is to:
        # 1. check every element. 
        # 2. then see if element - 1 exist, if not
        #       i. this means element is the start of the sequence
        # 3. check if element + 1 exist,
        #       i. if not, this means there is no consecutive sequence
        # continue
        
        for n in nums:
            if (n - 1) not in setNums:
                length = 0  
                while (n + length) in setNums:
                    length += 1
                max_count = max(length, max_count)
        return max_count




        