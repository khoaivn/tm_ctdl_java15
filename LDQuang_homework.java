import java.util.Arrays;

public class LDQuang_homework {

    public static double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        result[0] = celsius + 273.15;
        result[1] = (celsius*1.80)+32.00;
        return result;
    }
    public static int[] buildArray(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println("Bai 1: ");
        System.out.println(Arrays.toString(convertTemperature(36.5)));
        System.out.println("Bai 2: ");
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
