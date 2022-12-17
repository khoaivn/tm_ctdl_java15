package tm_ctdl_java15;

public class Thang_hello {
    public static void main(String[] args) {
        System.out.println("Class luu bai tap ve nha B1");
        System.out.println("Ho va Ten : Nguyen Duc Thang");
    }

    // Buổi 1
    // 1. Two Sum link bài tập : https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        endPro: for (int i = 0; i < nums.length; i++) {
            boolean isCheck = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (i != j)
                        isCheck = false;
                    result[0] = i;
                    result[1] = j;
                }
            }
            if (!isCheck) {
                break endPro;
            }
        }
        return result;
    }

    // B136 : Single Number link Bài tập :
    // https://leetcode.com/problems/single-number/
    public int singleNumber(int[] nums) {
        int isCheck = 0;
        int result = 0;
        endPro: for (int i = 0; i < nums.length; i++) {
            result = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (result != nums[j]) {
                    if (i != j) {
                        isCheck += 1;
                    }
                }
            }
            if (isCheck != nums.length - 1) {
                isCheck = 0;
            }
            if (isCheck == nums.length - 1) {
                break endPro;
            }
        }
        return result;
    }

    // B2469 : Convert the Temperature link Bài Tập :
    // https://leetcode.com/problems/convert-the-temperature
    public double[] convertTemperature(double celsius) {
        double[] returnConvert = new double[2];
        returnConvert[0] = celsius + 273.15;
        returnConvert[1] = celsius * 1.80 + 32.00;
        return returnConvert;
    }

    // Bài 1920. Build Array from Permutation link Bài Tập :
    // https://leetcode.com/problems/build-array-from-permutation/
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // Buổi 2 :
    // B1480. Running Sum of 1d Array link
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    // B387 : First Unique Character in a String
    public int firstUniqChar(String s) {
        int check = 0;
        int result = -1;
        endPro: for (int i = 0; i < s.length(); i++) {
            check = 0;
            char c = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c && i != j) {
                    check += 1;
                }
            }
            if (check == 0) {
                result = i;
                break endPro;
            }

        }
        return result;
    }

    // Buổi 3 :
    // B1051 : Height Checker link : https://leetcode.com/problems/height-checker/
    public int heightChecker(int[] heights) {
        int isCheck = 0;
        int[] list = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            list[i] = heights[i];
        }
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != list[i]) {
                isCheck += 1;
            }
        }
        return isCheck;
    }

    // B217. Contains Duplicate
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // B2404. Most Frequent Even Element..
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int recordCount = 0;
        int answer = -1;

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (nums[i] % 2 == 0) {
                int count = 1;
                while (i < nums.length - 1 && number == nums[i + 1]) {
                    count++;
                    i++;
                }
                if (count > recordCount) {
                    answer = number;
                    recordCount = count;
                }
            }
        }
        return answer;
    }

    // Buổi 4 : Đệ Quy
    // B509 : Fibonacci Number
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // B231 : Power of Two
    public boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        else {
            return isCheck(2, n);
        }
    }

    public boolean isCheck(long mu_hat, int n) {
        if (mu_hat > n)
            return false;
        if (mu_hat == n)
            return true;
        else
            return isCheck(mu_hat * 2, n);
    }

    // B326. Power of Three
    public boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        if (n == 0)
            return false;
        return isCheck(3, n);
    }

    public boolean isCheck(long so_mu, int n) {
        if (so_mu > n)
            return false;
        if (so_mu == n)
            return true;
        return isCheck(so_mu * 3, n);
    }

    // B342. Power of Four
    public boolean isPowerOfFour(int n) {
        if (n == 0)
            return false;
        if (n == 1)
            return true;
        if (n % 4 != 0)
            return false;
        return isPowerOfFour(n / 4);
    }

}