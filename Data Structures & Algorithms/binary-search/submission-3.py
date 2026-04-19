class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # input is a list and an integer
        # output is the index

        # binary search (divide and conquer)
        
        # edge case
        if len(nums) == 1:
            return 0 if target == nums[0] else -1

        # introduce start, end, and mid counters
        start = 0
        end = len(nums) - 1

        while start <= end:
            mid = (start + end) // 2

            if target == nums[mid]:
                return mid
            elif target > nums[mid]:
                start = mid + 1
            else:
                end = mid - 1
        
        return -1
            