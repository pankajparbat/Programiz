package programizexample;

import java.util.Arrays;

public class find_out_secound_largest_number {
    public static void main(String[] args) {
        int []arr={2,5,3,8,4,};
        int i;

        int coun=1;
        if (arr.length<=5)
        {
            Arrays.sort(arr);
            int max=arr[arr.length-1];
            for ( i= arr.length-1;i>=0;i--)
            {
                if (arr[i]<max)
                {
                    coun++;

                }
                if (coun==2)
                {
                    System.out.println("secound largest number in that arrays "+Arrays.toString(arr)+" is "+arr[i]);
                }
            }

        }
        else
        {
            System.out.println("size of the array is greater thaan the 5");
        }

    }
}
