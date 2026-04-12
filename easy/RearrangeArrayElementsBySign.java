class Solution {
    public int[] rearrangeArray(int[] arr) {
             int n=arr.length;
           ArrayList<Integer> pos=new ArrayList<>();
           ArrayList<Integer> neg=new ArrayList<>();
           for(int i=0;i<n;i++)
           {
             if(arr[i]>0) pos.add(arr[i]);
             else neg.add(arr[i]);
           }
           int i=0,p=0,q=0;
           while(p<pos.size() && q<neg.size())
           {
             arr[i++]=pos.get(p++);
             arr[i++]=neg.get(q++);

           }
           while(p<pos.size()) arr[i++]=pos.get(p++);
           while(q<neg.size()) arr[i++]=neg.get(q++);

             return arr;

//-----------------------------------
         int n=arr.length;
         int temp1[]=new int[n/2];
         int temp2[]=new int[n/2];
         int j=0;
         int k=0;
           for(int i=0;i<n;i++)
           {
             if(arr[i]>=0)
             {
                temp1[j]=arr[i];
                j++;
             }
             if(arr[i]<0)
             {
                 temp2[k]=arr[i];
                   k++;

             }
           }
          int p=0;
          int q=0;
          int index=0;
         while(p<n/2 && q<n/2)
           {
             arr[index++]=temp1[p];
             p++;
             arr[index++]=temp2[q];
             q++;
           }
                return arr;

//---------------------------------------
            for(int i=0;i<n/2;i++)
            {
             arr[2*i]=pos[i];
             arr[2*i+1]=neg[i];
            }

//-------------------------------------------------------------------
        int posIndex=0;
        int negIndex=1;
        int n=arr.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                ans[posIndex]=arr[i];
                posIndex+=2;
            }else{
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
        } return ans;


//------------------------------------------------------------------------------------------
        //SECOND VARIETY WHEN POSITIVES NOT EQUAL TO NEGATIVES
            import java.util.*;

        class Main {
            public int[] rearrangeArray(int[] arr)
            {
                int n = arr.length;
                ArrayList<Integer> pos = new ArrayList<>();
                ArrayList<Integer> neg = new ArrayList<>();

                for(int i = 0; i < n; i++)
                {
                    if(arr[i] >= 0) pos.add(arr[i]);
                    else neg.add(arr[i]);
                }

                int i = 0, p = 0, q = 0;

                while(p < pos.size() && q < neg.size())
                {
                    arr[i++] = pos.get(p++);
                    arr[i++] = neg.get(q++);
                }

                while(p < pos.size())
                {
                    arr[i++] = pos.get(p++);
                }

                while(q < neg.size())
                {
                    arr[i++] = neg.get(q++);
                }

                return arr;
            }
        }
    }}