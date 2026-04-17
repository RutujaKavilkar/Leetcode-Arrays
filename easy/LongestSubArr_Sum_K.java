class Main {
     public static int LongestSubarr_SumZero(int arr[])
     {
         int n=arr.length;
         int maxi=0;
         for(int i=0;i<n;i++)
         {
             int count=1;
             int sum=0;
             for(int j=i;j<n;j++)
             {
                 sum+=arr[j];
                 if(sum==0)
                 {
                     int length=j-i+1;
                     maxi=Math.max(maxi,length);
                 }
             }

         } return maxi;
     }
     //----------------------------------------------------------------
import java.util.*;

    class Main {
        public static int LongestSubarr_SumZero(int arr[])
        {
            int n=arr.length;
            HashMap<Integer,Integer> map=new HashMap<>();
            int sum=0;
            int maxi=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(sum==0)
                {
                    maxi=i+1;
                }
                if(map.containsKey(sum))
                {
                    int length=i-map.get(sum);
                    maxi=Math.max(maxi,length);
                }else
                {
                    map.put(sum,i);
                }

            }return maxi;
        }

        public static void main(String[] args) {
            // System.out.println("Try programiz.pro");
            int array[] = {6, -2, 2, -8, 1, 7, 4, -10};
            System.out.println(LongestSubarr_SumZero(array));

        }
    }