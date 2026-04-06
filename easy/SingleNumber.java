class Solution {
    public int singleNumber(int[] arr) {
        //  (  Applicable only when array is sorted else not  )
             int n=arr.length;
             if(n==1)
             return arr[0];
             if(arr[0]!=arr[1])
             return arr[0];
             if(arr[n-2]!=arr[n-1])
             return arr[n-1];
             for(int i=1;i<n-1;i++)
             {
                 if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1])
                 {
                     return arr[i];
                 }
             }return 0;
//-----------------------------------------------------------------------------------
         int xor=0;
         for(int num: arr){
             xor^=num;
         } return xor;
//------------------------------------------------------------------------------
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(int num:arr)
        {
            if(map.get(num)==1)
            {
                return num;
            }
        }
        return -1;
//------------------------------------------------------------------------------------

    }
}
