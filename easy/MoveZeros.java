class Solution {
    public void moveZeroes(int[] arr) {
     int n=arr.length;
     int l=0;
     int temp[]=new int[n];
     for(int i=0;i<n;i++)
     {

         if(arr[i]!=0)
         {
             temp[l++]=arr[i];
         }
     }
     for(int i=0;i<l;i++){

         arr[i]=temp[i];
     }
     for(int i=l;i<n;i++)
     {
        arr[i]=0;
     }

    }

}

int j=-1;
    for(int i=0;i<n;i++)
    {
        if(a[i]==0)
        {
            j=i;
            break;
        }
    }

     }
     }

    class Solution {
        public void moveZeroes(int[] a) {
    if(j==-1) return;
    for(int i=j+1;i<n;i++)
    {
        if(a[i]!=0)
        {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
            j++;
        }
    }
    }
