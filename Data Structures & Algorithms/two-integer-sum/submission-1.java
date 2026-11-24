class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            Integer complement=mp.get(target - nums[i]);

            if(complement!=null){
                return new int[]{complement, i};
            }else{
                mp.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    private void display(Map<Integer, Integer> mp){
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            System.out.print(e.getKey()+" : "+e.getValue()+", ");
        }
        System.out.println("");
    }
}