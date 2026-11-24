class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNum=new HashSet<Integer>();
        for(int i=0; i<nums.length;i++){
            if(!uniqueNum.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}