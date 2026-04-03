class Solution {
    public void rotate(int[] arr, int k) {

         int n=arr.length;
         if(n==0) return;
         k=k%n;
         k=n-k;
          int temp[]=new int[k];
         for(int i=0;i<k;i++)
         {
             temp[i]=arr[i];
         }
         for(int i=k;i<n;i++)
         {
             arr[i-k]=arr[i];
         }
         for(int i=0;i<k;i++){
             arr[n-k+i]=temp[i];
         }
    }
}

class Solution {
    public void rotate(int[] arr, int k) {

int n=arr.length;
k=k%n;
reverse(arr,0,n-1);
reverse(arr,0,k-1);
reverse(arr,k,n-1);

    }
public static void reverse(int arr[],int start,int end) {
    while (start <= end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}}