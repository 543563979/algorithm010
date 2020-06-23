class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length ;i++) {
            int result = target - nums[i];
            if(map.containsKey(result) && map.get(result)!=i){
                return new int[]{i,map.get(result)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}