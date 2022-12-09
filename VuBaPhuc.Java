// 2235. Add Two Integers
class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}

// bài tập về nhà buổi 1
// 2469. Convert the Temperature
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius*1.80 + 32.00;
        double ans[] = {kelvin,fahrenheit};
        return ans;
    }
}
// 1920. Build Array from Permutation
class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            ans[i]=nums[a];
        }
        return ans;
    }
}
//1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if((target-nums[j])==nums[i]){
                        return new int[]{i,j};
                    }
                }
            }
            return null;
    }
}
//1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i < nums.length; i++){
            int a = target - nums[i];
            Integer b =  map.get(a);
            if(b != null){
                return new int[]{i,b};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
//136. Single Number
class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int a = 0;
            for(int j= 0; j < nums.length; j++){
               if(nums[i] == nums[j]){
                   a++;
               } 
           }
            if (a == 1){
                return nums[i];
            } 
        }
        return 0;
    }
}
//136. Single Number
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
            for(int i : nums) {
                if(set.contains(i)) {
                    set.remove(i);
                } else {
                    set.add(i);
                }
            }
            return set.iterator().next();
    }
}
public class Main {
    public static void main(String[] args) {

    }
}