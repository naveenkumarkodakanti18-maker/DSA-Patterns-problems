import java.util.Arrays;
class Solution2 
{
    public static int[] twoSum(int nums[],int target)
    {
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            int sum=nums[i]+nums[j];
            if(sum==target)
            {
                return new int[]{i,j};
            }
            else if(sum>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String args[]) 
    {
        int nums[]={1,2,3,4,5,7};
        int target=9;
        int result[]=twoSum(nums,target);
        System.out.print(Arrays.toString(result));
    }
}
