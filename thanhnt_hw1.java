public class thanhnt_hw1 {
    //Cau 136
        public int singleNumber(int[] nums) {
            int num = 0;
            for(int i = 0; i < nums.length; i++){
                num = num+nums[i];
                for(int j = 0; j < nums.length; j++){
                    if(i!=j &  nums[i] == nums[j]) {
                        num = num - nums[i];
                    }
                }
            }
            return num;
        }
    //Cau 1
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for (int i = 0; i< nums.length; i++){
            int j = target - nums[i];
            for (int k = 0; k< nums.length; k++)
                if(k != i & nums[k] == j){
                    ans[0] = i;
                    ans[1] = k;
                    break;
                }
        }
        return ans;
    }
    //Cau 1920
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];     
        for (int i : nums) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    //Cau 2469
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.8 + 32;
        double[] ans = {Kelvin , Fahrenheit};
        return ans;
    }
}
