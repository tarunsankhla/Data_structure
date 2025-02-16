class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length ;
        List<List<Integer>> otpt = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            while(i > 0  &&  nums[i] == nums[i-1]) i++;
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    otpt.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }else if(sum <0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return new ArrayList<>(otpt);
    }
}
