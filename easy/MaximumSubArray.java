
class Solution {
    public int maxSubArray(int[] arr) {
         int n = arr.length;
         int maxi=Integer.MIN_VALUE;
         for(int i=0;i<n;i++)
         {
             int sum=0;
         for(int j=i;j<n;j++)
         {
             sum=sum+arr[j];

         maxi=Math.max(maxi,sum);
         }
         }
         return maxi;

        //------------------------------------------------------------------------
         int n= arr.length;
         int maxi=Integer.MIN_VALUE;

         for(int i=0;i<n;i++)
         { int sum=0;
             for(int j=i;j<n;j++)
             {
                 sum+=arr[j];
                 maxi=Math.max(maxi,sum);
             }

         }
         return maxi;
//---------------------------------------------------------------------------------------

    }
}