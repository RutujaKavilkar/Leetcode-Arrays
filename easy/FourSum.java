class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
         int n = nums.length;
         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(nums);
         for(int i=0;i<n;i++)
         {
             if(i>0 && nums[i]==nums[i-1]) continue;
             for(int j=i+1;j<n;j++)
             {
                 if(j!=i+1 &&nums[j]==nums[j-1]) continue;
                 int k=j+1;
                 int l=n-1;
                 while(k<l)
                 {
                     long sum=(long) nums[i];
                     sum+=nums[j];
                     sum+=nums[k];
                     sum+=nums[l];
                     if(sum==target)
                     {
                     List<Integer> list=new ArrayList<>();
                     list.add(nums[i]);
                     list.add(nums[j]);
                     list.add(nums[k]);
                     list.add(nums[l]);
                     ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                     k++;
                     l--;
                     while(k<l&&nums[k]==nums[k-1]) k++;
                     while(k<l&&nums[l]==nums[l+1]) l--;
                     }
                     else if(sum<target) k++;
                     else l--;
                 }
             }
         } return ans;
//-------------------------------------------------------------------
         Set<List<Integer>> set=new HashSet<>();
         int n=arr.length;
         for(int i=0;i<n;i++)
         {
             int sum=0;
             for(int j=i+1;j<n;j++)
             {
                 for(int k=j+1;j<n;j++)
                 {
                     for(int l=k+1;l<n;l++)
                     {
                         sum=arr[i]+arr[j];
                         sum=arr[k]+arr[k];
                         if(sum==target)
                         {
                         List<Integer> temp=new ArrayList<>();
                             temp.add(arr[i]);
                             temp.add(arr[j]);
                             temp.add(arr[k]);
                             temp.add(arr[l]);
                             Collection.sort(arr);
                             set.add(arr);
                         }
                     }
                 }

             }
         }return new ArrayList<>(set);

//--------------------------------------------------------------------------
 int n=arr.length;
 Set<List<Integer>> set=new HashSet<>();
 for(int i=0;i<n;i++)
 {
     for(int j=i+1;j<n;j++)
     {
          Set<Integer> hashSet=new HashSet<>();
         for(int k=j+1;k<n;k++){
            int fourth=target-(arr[i]+arr[j]+arr[k]);
            if(hashSet.contains(fourth))
            {
             List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k],fourth);
             Collections.sort(temp);
             set.add(temp);

            }
            hashSet.add(arr[k]);
         }
     }

     }

 return new ArrayList<>(set);

//--------------------------------------------------------------------------
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++)
            {
                if(j>i+1 && arr[j]==arr[j-1])
                    continue;
                int k=j+1;
                int l=n-1;
                while(k<l)
                {
                    long sum=(long) arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target)
                    {
                        ans.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        k++;
                        l--;
                        while(k<l&& arr[k]==arr[k-1]) k++;
                        while(k<l&& arr[l]==arr[l+1]) l--;
                    }else if(sum<target)
                    {
                        k++;
                    }else
                    {
                        l--;
                    }
                }

            }
        }return ans;

    }
}
