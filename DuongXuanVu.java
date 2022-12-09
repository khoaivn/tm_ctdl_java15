public class DuongXuanVu {
    public static void main(String[] args) {

    }

    // 2469. Convert the Temperature
    public double[] convertTemperature(double celsius) {
        double [] result = {celsius + 273.15, celsius * 1.80 + 32.00};
        return result;
    }

    // 1920. Build Array from Permutation
    public int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length ; i++){
            int j = nums[i];
            newArray[i] = nums[j];
        }
        return newArray;
    }

    // 1. Two Sum
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1 ; i++){
            for (int j = i +1; j < nums.length; j++){
                if  (nums[i]+nums[j] == target){
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
        return null;
    }

    // 136. Single Number
    public static int singleNumber(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        } else {
            for(int i = 0; i < nums.length; i++){
                boolean check = false;
                for(int j= 0; j < nums.length; j++){
                    if (nums[i] == nums[j] && i != j) {
                        check = true;
                        break;
                    }
                }
                if (check == false){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
