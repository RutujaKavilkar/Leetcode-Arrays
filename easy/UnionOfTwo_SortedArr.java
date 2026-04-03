import java.util.*;
class Main {
    public static void unionArr(int arr1[],int arr2[])
    {
        int n1=arr1.length;
        int n2=arr2.length;


        Set<Integer> set=new HashSet<>();
        int union[]=new int[n1+n2];
        for(int i=0;i<n1;i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++)
        {
            set.add(arr2[i]);
        }
        int i=0;
        for(int it: set){
            union[i]=it;
            System.out.println(union[i]);
            i++;
        }

    }
    public static void main(String[] args)
    {
        int arr1[]={1,2,2,3,4,4};
        int arr2[]={5,5,6,6,7,8};
        unionArr(arr1,arr2);
    }
}