class Solution {
    public int subarraySum(int[] arr, int k) {
            int n=arr.length;
            HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0,1);
            int preSum=0;
            int count=0;
            for(int i=0;i<n;i++)
            {
             preSum+=arr[i];
             int remove=preSum-k;
             if(map.containsKey(remove))
             {
                 count+=map.get(remove);
             }

            map.put(preSum,map.getOrDefault(preSum,0)+1);

            }return count;

        // -------------------------------------------------------------------

         int n=arr.length;
         HashMap<Integer,Integer> map=new HashMap<>();
         map.put(0,1);
         int preSum=0;
         int count=0;

         for(int i=0;i<n;i++)
         {
             preSum+=arr[i];
             int remove=preSum-k;
             if(map.containsKey(remove))
             {
                 count+=map.get(remove);
             }
             map.put(preSum, map.getOrDefault(preSum,0) + 1);

         }return count;




    }
}

