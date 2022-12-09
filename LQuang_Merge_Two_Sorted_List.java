import java.util.Arrays;

public class Merge_Two_Sorted_List {

    public static void mergeTwoSortedList(int[] a1, int n, int[] a2, int m){
        for (int ai:a2) {
            ChenPhanTu(ai,a1,n);
            n++;
        }
        System.out.println(Arrays.toString(a1));
    }

    private static void ChenPhanTu(int ai, int[] a1, int n) {
        boolean isChecked = false;
        for (int i=0;i<n;i++){
            if (a1[i] > ai){
                isChecked = true;
                for (int j = n-1;j>=i;j--){
                    a1[j+1] = a1[j];
                }
                a1[i] = ai;
                break;
            }
        }
        if (isChecked == false){
            a1[n] = ai;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1,3,5,7,0,0,0,0};
        int[] a2 = {2,4,6,8};
        mergeTwoSortedList(a1,4,a2,4);
    }
}
