
class Main {
    public static void MissingNum(int arr[], int N)
    {
         for(int i=1;i<=N;i++)
         {
             boolean found=false;
             for(int j=0;j<arr.length;j++)
             {
                 if(arr[j]==i)
                 {
                     found=true;
                     break;
                 }
             }
             if(!found)
             {
                 System.out.println(i);
             }

         }
        //------------------------------------------------
         int sum=0;
         int a=N*(N+1)/2;
         for(int i=0;i<arr.length;i++)
         {
             sum+=arr[i];
         }
         System.out.println(a-sum);
        //-------------------------------------------------
         int hash[]=new int [N+1];
         for(int i=0;i<arr.length;i++)
         {
             hash[arr[i]]=1;
         }
         for(int i=1;i<=N;i++)
         {
           if(hash[i]==0)
             System.out.println(i);

         }
        //-----------------------------------

         int xor1 = 0; // for 1 to N
         int xor2 = 0; // for array

         // XOR of 1 to N
         for(int i = 1; i <= N; i++)
         {
             xor1 ^= i;
         }

         // XOR of array elements
         for(int i = 0; i < arr.length; i++)
         {
             xor2 ^= arr[i];
         }

         // Missing number
         System.out.println(xor1 ^ xor2);


        //-------------------------------

        int xor = 0;

        for(int i = 0; i < arr.length; i++)
        {
            xor ^= arr[i];   // XOR array element
            xor ^= (i + 1);  // XOR numbers 1 to N-1
        }

        xor ^= N; // include last number

        System.out.println(xor);



    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        int n=7;
        MissingNum(arr,n);

    }
}