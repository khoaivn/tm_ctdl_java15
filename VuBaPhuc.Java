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
//136. Single Number vòng for
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
//136. Single Number list
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
// 1295. Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
         int a = 0;
        for(int i = 0; i < nums.length; i++) {
            int b = nums[i];
            int check = 0;
            while(b>0) {
                b = b/10;
                check++;
            }
            if(check % 2 == 0) {
                a++;
            }
        }
        return a;
    }
}
// 88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //1. lay tung phan tu mang 2
        for(int j = 0; j < n; j++){
            //2 tim vi tri chen mang 1
            int i = 0;
            while(i < m && nums1[i] < nums2[j]){
                i++;
            } 
            // chen
            for(int u = m; u > i; u--){
                nums1[u] = nums1[u-1];
            }
            nums1[i] = nums2[j];
            m++;
        }
    }
}
// 27. Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int a = nums.length;
        for(int i = 0; i < a; i++){
            if(nums[i] == val){
                nums[i] = nums[a - 1];
                i--;
                a--;
            }
        }
    return a;
    }
}
// bài tập về nhà buổi 2
// 1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        int sumNums = 0;
        int runningSums[] = new int [nums.length];
        for (int i= 0; i < nums.length; i++){
            sumNums += nums[i];
            runningSums[i] = sumNums;
        }
        return runningSums;
    }
}
// 387. First Unique Character in a String
// bị Time Limit Exceeded
class Solution {
    public int firstUniqChar(String s) {
        int nums[] = new int[s.length()];
        int len = nums.length;
        for(int i = 0; i < s.length(); i++){
            nums[i] = s.charAt(i);
        }
        for(int i = 0; i < nums.length; i++){
            int a = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    a++;
                }
            }
            if(a == 1){
                return i;
            }
        }
    return -1;
    }
}
// 387. First Unique Character in a String
class Solution {
    public int firstUniqChar(String s) {
            String newString = s;
            while(s.length() > 0)
            {
                int curLength = s.length();
                String first = String.valueOf(s.charAt(0));
                s = s.replaceAll(first, "");
                if(s.length() == curLength - 1)
                    return newString.indexOf(first);
            }
            return -1;
    }
}
// 283. Move Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++){
           for(int j = i+1; j < nums.length; j++){
               if(nums[i] == 0 && nums[j] !=0){
                   int temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
           }
        }
    }
}
// 1089. Duplicate Zeros

public class Main {
    public static void main(String[] args) {

    }
}