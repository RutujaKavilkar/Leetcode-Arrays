by thre i mean  int[] freq = new int[n+1];

        for(int num : arr){
        freq[num]++;
        }

        for(int i = 1; i <= n; i++){
        if(freq[i] == 2) repeating = i;
        if(freq[i] == 0) missing = i;
        }

        //-------------------------------------------------------
        int n=arr.length;
        int repeating=-1;
        int missing=-1;
        for(int i=1;i<=n;i++)
        {
        int cnt=0;
        for(int j=0;j<n;j++)
        {
        if(arr[j]==i) cnt++;
        }
        if(cnt==2) repeating=i;
        else if(cnt==0) missing=i;

        if(repeating!=-1&& missing !=-1)
        {
        break;
        }


        } return new int[]{repeating, missing};

        //----------------------------------------
        import java.util.*;

class Solution {
    // Function to find repeating and missing numbers
    public int[] findMissingRepeatingNumbers(int[] nums) {

        // Size of the array
        int n = nums.length;

        // Hash array to count occurrences
        int[] hash = new int[n + 1];

        // Update the hash array:
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }

        int repeating = -1, missing = -1;

        // Find the repeating and missing number:
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }

            // Stop early if both found
            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        // Return [repeating, missing]
        return new int[]{repeating, missing};
    }
}

// Separate main class
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        // Create an instance of Solution class
        Solution sol = new Solution();

        int[] result = sol.findMissingRepeatingNumbers(nums);

        // Print the repeating and missing numbers found
        System.out.println("The repeating and missing numbers are: {"
                + result[0] + ", " + result[1] + "}");
    }
}                              import java.util.*;
//----------------------------------------------------------
class Solution {
    // Function to find repeating and missing numbers
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length; // Size of the array
        int repeating = -1, missing = -1;

        // Find the repeating and missing number:
        for (int i = 1; i <= n; i++) {
            // Count the occurrences:
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) cnt++;
            }

            // Check if i is repeating or missing
            if (cnt == 2) repeating = i;
            else if (cnt == 0) missing = i;

            // Stop early if both found
            if (repeating != -1 && missing != -1)
                break;
        }

        // Return {repeating, missing}
        return new int[]{repeating, missing};
    }
}

// Separate main class
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        // Create an instance of Solution class
        Solution sol = new Solution();

        int[] result = sol.findMissingRepeatingNumbers(nums);

        // Print the repeating and missing numbers found
        System.out.println("The repeating and missing numbers are: {"
                + result[0] + ", " + result[1] + "}");
        //--------------------------------------------------
        import java.util.*;

        public class Solution {
            public int[] findErrorNums(int[] nums) {
                int n = nums.length;

                int totalSum = 0;
                int uniqueSum = 0;

                HashSet<Integer> set = new HashSet<>();

                for (int num : nums) {
                    totalSum += num;

                    if (!set.contains(num)) {
                        set.add(num);
                        uniqueSum += num;
                    }
                }

                int A = totalSum - uniqueSum;  // repeating

                int expectedSum = n * (n + 1) / 2;

                int B = A - (totalSum - expectedSum);  // missing

                return new int[]{A, B};
            }
        }
    }
}
