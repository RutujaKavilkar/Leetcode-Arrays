class Solution {
    public int majorityElement(int[] v) {

         int n=arr.length;
        int count=0;
        int ele;
        for(int i=0;i<n;i++)
        {
         if(cnt==0)
         {
             cnt=1;
             ele=v[i];
         }else if(v[i]==ele)
         {
             cnt++;
         }else{
             cnt--;
         }
        }
        int cnt1=0;
        for(int i=0;i<n;i++)
        {
         if(v[i]==ele) cnt1++;
        }
        if(cnt1>(v.size()/2))
        {
         return ele;
        }
 return -1;

//----------------------------------------------------------------------------------

 int n=arr.length;
 if(n==1) return arr[0];
 for(int i=0;i<n;i++)
 {
     int count=0;
     for(int j=0;j<n;j++)
     {
         if(arr[i]==arr[j])
         count++;

     }
     if(count>n/2)
     {
         return arr[i];
     }
 }

 return -1;

//-----------------------------------------------------------------------------------------------------
 HashMap<Integer,Integer> map=new HashMap<>();
 int n=arr.length;
 for(int i=0;i<n;i++)
 {
     int num=arr[i];
     map.put(num,map.getOrDefault(num,0)+1);
     if(map.get(num)>n/2){
         return num;
     }
 }return -1;
//---------------------------------------------------------------------------------------
        int n=v.length;
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count=1;
                ele=v[i];
            }
            else if(v[i]==ele)
            {
                count++;
            }
            else{
                count--;
            }

        }
        int count1=0;
        for(int i=0;i<n;i++)
        {
            if(v[i]==ele)
                count1++;
        }
        if(count1>n/2){
            return ele;}
        return -1;

//---------------------------------------------------------------------------------------



    }
}
