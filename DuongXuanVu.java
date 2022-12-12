public class DuongXuanVu {
    public static void main(String[] args) {

        System.out.println(firstUniqChar("aabb"));
    }


    public static int firstUniqChar(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = s.charAt(i);
        }
        for (int i = 0; i < arr.length - 1; i++){
            int check = 0;
            int k = 0;
            while(k < arr.length){
                if (arr[i] == arr[k] && k != i){
                    check++;
                }
                k++;
            }
            if( check == 0){
                return i;
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
