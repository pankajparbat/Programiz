package every_day;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Avarage_by_using_arrays {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,8};
        int sum=0;
        Arrays.sort(arr);
        for (int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        float avrage= sum/arr.length;
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Format to two decimal places
        String formattedAverage = decimalFormat.format(decimalFormat);
        System.out.println(formattedAverage);
    }
}
