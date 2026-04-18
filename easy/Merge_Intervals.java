class Solution {
    public int[][] merge(int[][] intervals) {
//        if(arr.length<=1)
//        return arr;
//        Arrays.sort(arr,Comparator.comparingInt(i->i[0]));
//        List<int[]> result=new ArrayList<>();
//         int [] startarr=arr[0];
//         result.add(startarr);
//         for(int [] x:arr)
//         {
//             if(x[0]<=startarr[1])
//             {
//                 startarr[1]=Math.max(startarr[1],x[1]);

//             }else{
//                 startarr=x;
//                 result.add(startarr);
//             }
//         }
// return result.toArray(new int[result.size()][]);

        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1)[1])
            {
                ans.add(intervals[i]);

            }else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
            }

        }
        return ans.toArray(new int[ans.size()][]);




    }
}