import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        import java.util.Arrays;

        class Main {
            public static  int longestConsecutive(int[] nums)
            {
                if(nums.length==0) return 0;
                Arrays.sort(nums);
                int longest=1;
                int count=1;
                for(int i=1;i<nums.length;i++)
                {
                    if(nums[i]==nums[i-1]+1){
                        count++;
                    }else if(nums[i]!=nums[i-1])
                    {
                        count=1;
                    }
                    longest=Math.max(longest,count);


                }
                return longest;
            }
            public static void main(String[] args) {

                int[] nums = {100, 4, 200, 1, 3, 2};
                System.out.println(longestConsecutive(nums));
            }
        }
        //---------------------------------------------------------------

        int longest=1;
        int count=0;
        int n=arr.length;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        for(int i=0;i<n;i++)
        {
            int x=arr[i];
            count=1;
            while(ls(arr,x+1)==true)
            {
                x=x+1;
                count=count+1;
            }
            longest=Math.max(longest,count);
        }
        return longest;

    }
    public static boolean ls(int arr[], int x)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return true;
            }
        }return false;
    }
}

//----------------------------------------------------------------
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        // Step 1: add all elements to set
        for(int num : nums) {
            set.add(num);
        }

        int longest = 1;

        // Step 2: check for sequence starts
        for(int num : set) {

            // only start if num-1 is NOT present
            if(!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // expand sequence
                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
    }
}