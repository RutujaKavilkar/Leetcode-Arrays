class Solution {
    public static int removeDuplicates(int arr[]) {
        int n = arr.length;

        int i = 0; // points to last unique element

        for(int j = 1; j < n; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1; // length of unique elements
    }
}


class Solution {
    public static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements to set (removes duplicates automatically)
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Copy back to array
        int i = 0;
        for(int num : set) {
            arr[i] = num;
            i++;
        }

        return set.size();
    }
}


