public class DuongXuanVu {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }


    //217. Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            int j = i+1;
            while(j<nums.length){
                if (nums[i] == nums[j]){
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    // 1051. Height Checker
    public static int heightChecker(int[] heights) {
        int count = 0;
        int [] nums = new int[heights.length];
        // copy mảng

        for (int i = 0; i < nums.length; i++) {
            nums[i]= heights[i];
        }
        // sắp xếp mảng được copy sử dụng insertion sort
        int t,j;
        for (int i = 1; i < nums.length; i++) {
            j = i-1;
            t = nums[i];
            while ( j>=0 && t < nums[j]){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1] = t;
        }

        // kiểm tra số phần tử khác nhau sau sắp xếp
        for (int i = 0; i < nums.length; i++){
            if (heights[i] != nums[i]){
                count++;
            }
        }
        return count;
    }

    // 387. First Unique Character in a String
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j){
                    break;
                }
                if (j == s.length() -1 ){
                    return i;
                }
            }
        }
        return -1;
    }


    // 1480. Running Sum of 1d Array

    public int[] runningSum(int[] nums) {
        int [] arr = new int[nums.length];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            arr[i] = arr[i-1] + nums[i];
        }
        return arr;
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
