class TwoSum {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int i=0;
        int rem=0;
        for(i=0;i<nums.length;i++)
        {
            rem=target-nums[i];
            if(hm.containsKey(rem))
                break;
            else
                hm.put(nums[i],i);
        }
        return new int[]{i,hm.get(rem)};
    }
}