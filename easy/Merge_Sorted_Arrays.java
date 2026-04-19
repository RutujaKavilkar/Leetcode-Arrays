import java.util.Arrays;

class Solution {

    public void merge(int[] arr1, int m, int[] arr2, int n) {
//----------------------------------------------------------------------
 int temp[]=new int[n+m];
 int left=0;
 int right=0;
 int index=0;
 while(left<m && right<n)
 {
 if(arr1[left]<arr2[right])
 {
     temp[index++]=arr1[left++];
 }
 else{
     temp[index++]=arr2[right++];

 }
 }
 while(left<m)
 {
     temp[index++]=arr1[left++];
 }
 while(right<n)
 {
     temp[index++]=arr2[right++];
 }
 for(int i=0;i<n+m;i++)
 {
         arr1[i] = temp[i];
 }
// --------------------------------------------------
 int left=m-1;
 int right=0;
 while(left>=0 &&right<n)
 {
     if(arr1[left]>arr2[right])
     {
         int temp=arr1[left];
         arr1[left]=arr2[right];
         arr2[right]=temp;
         left--; right++;
     }else
     {
         break;
     }
 }
 //Arrays.sort(arr1);
 Arrays.sort(arr2);

  for(int i = 0; i < n; i++) {
             arr1[m + i] = arr2[i];
         }
 Arrays.sort(arr1);


    }
}

