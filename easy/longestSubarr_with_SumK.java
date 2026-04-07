class Main {
    // System.out.println("Try programiz.pro");
    public static void MaxSubArr(int arr[],int k){
        int n=arr.length;
        int maxLen=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k){
                    maxLen=Math.max(maxLen,j-i+1);
                }

            }
        }System.out.println(maxLen);
    }
    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        int k = 15;
        MaxSubArr(arr,k);

    }
}
//--------------------------------------------------------------------------------------------------------

import java.util.*;

class Main {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            // Case 1: sum itself = k
            if(sum == k){
                maxLen = i + 1;
            }

            // Case 2: (sum - k) seen before
            if(map.containsKey(sum - k)){
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            // Store only first occurrence
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {-3, 2, 1};
        int k = 6;

        System.out.println(longestSubarray(arr, k));
    }
}
//---------------------------------------------------------------------------------

class Main {
    // System.out.println("Try programiz.pro");
    public static void MaxSubArr(int arr[],int k){
        int n=arr.length;
        int left=0;
        int sum=0;
        int maxLen=0;
        for(int right=0;right<arr.length;right++)
        {
            sum+=arr[right];
            while(sum>k)
            {
                sum-=arr[left];
                left++;

            }maxLen=Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        int k = 15;
        MaxSubArr(arr,k);

    }
}