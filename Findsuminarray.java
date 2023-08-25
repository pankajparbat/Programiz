package every_dat;

import java.util.Arrays;
//https://leetcode.com/problems/two-sum/description/
public   class Findsuminarray{
        static int[] twoSum(int[] nums, int target) {
            for (int i=0;i<nums.length-1;i++)
            {
                for (int j=i+1;j< nums.length;j++)
                {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int []{};
        }
    public static void main(String[] args) {
        int i = 6;
        int [] arr={1,2,4,5};
        int [] pa=twoSum(arr,i);
        System.out.println("this "+Arrays.toString(pa));


    }
}
