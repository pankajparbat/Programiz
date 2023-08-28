package every_day;

import java.util.Arrays;

public class find_out_largest_number {
    public static void main(String[] args) {
        int arr[]={2,4,62,3,8,41};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
