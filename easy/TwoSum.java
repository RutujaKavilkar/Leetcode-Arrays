class Solution {
    public int[] twoSum(int[] arr, int t) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return new int[]{mpp.get(moreNeeded), i};
            }
            mpp.put(num, i);
        }
        return new int[]{-1, -1};
    }

//--------------------------------------------------
 int n=arr.length;

 for(int i=0;i<n;i++)
 {
     for(int j=i+1;j<n;j++)
     {
         if(arr[i]+arr[j]==t)
         {
             return new int[]{i,j};
         }
     }

 }
 return new int[]{-1,-1};

//---------------------------------------------------------------------------

    }}








