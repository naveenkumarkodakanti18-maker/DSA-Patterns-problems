import java.util.Arrays;
class Solution3 
{
    public static int[] squaredArray(int nums[])
    {
        int result[] = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int pos=nums.length-1;
        while(i<=j)
        {
            int left= nums[i]*nums[i];
            int right=nums[j]*nums[j];
            if(left>right)
            {
                result[pos]=left;
                i++;
            }
            else
            {
                result[pos]=right;
                j--;
            }
            pos--;
        }
        return result;
    }
    public static void main(String args[])
    {
        int nums[]={-4,-2,1,3,7};
        int result[]=squaredArray(nums);
        System.out.print(Arrays.toString(result));
    }
}
