class Solution:
    def search(self, nums: List[int], tar: int) -> int:

        l = 0;
        r = len(nums) -1 

        while l <= r:
            mid = (l + r) //2

            if nums[mid] == tar:
                return mid
            elif nums[mid] > tar:
                r = mid - 1
            else:
                l = mid + 1
        return -1;                

        