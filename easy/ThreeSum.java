public class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
         List<List<Integer>> ans = new ArrayList<>();
         int n = arr.length;
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 for(int k=0;k<n;k++)
                 {
                     if(nums[i]+nums[j]+nums[k]==0&& i!=j && i!=k &&j!=k)
                 }
             }
         }
         //--------------------------------------------------------------------------
     int n=arr.length;
 int count=0;
 Set<List<Integer>> set=new HashSet<>();
         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++)
             {
                 for(int k=j+1;k<n;k++)
                 {
                     if(arr[i]+arr[j]+arr[k]==0)
                     {
                         List<Integer> temp=new ArrayList<>();
                         temp.add(arr[i]);
                         temp.add(arr[j]);
                         temp.add(arr[k]);

                     Collections.sort(temp);
                     set.add(temp);
                     }
                 }
             }
         }return new ArrayList<>(set);

//-------------------------------------------------------------------

 int n=arr.length;
 Set<List<Integer>> set=new HashSet<>();
 for(int i=0;i<n;i++)
 {
     Set<Integer> hashSet=new HashSet<>();
     for(int j=i+1;j<n;j++)
     {
         int third=-(arr[i]+arr[j]);
         if(hashSet.contains(third))
         {
             List<Integer> temp=Arrays.asList(arr[i],arr[j],third);
             Collection.sort(temp);
             set.add(temp);

         }
         hashSet.add(nums[j]);
     }

 }
 return new ArrayList<>(set);

        //-------------------------------------------------------------------------

        List<List<Integer>> result=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i]==arr[i-1]) continue;
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<0)
                {
                    left++;
                }
                else if(sum>0)
                {
                    right--;
                }else{
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                    while(left<right && arr[left]==arr[left-1])
                        left++;
                    while(left<right && arr[right]==arr[right+1]) right--;

                }


            }
        }
        return result;
    }
}

