import java.util.Arrays;
class Solution4 
{
    public static int[] moveZeros(int nums[])
    {
        int i=0;
        int k=0;
        while(i<nums.length)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        while(k<nums.length)
        {
            nums[k]=0;
            k++;
        }
        return nums;
    }
    public static void  main(String args[])
    {
        int nums[]={2,-1,0,6,4,0,1};
        int result[]=moveZeros(nums);
        System.out.print(Arrays.toString(result));
    }
}
