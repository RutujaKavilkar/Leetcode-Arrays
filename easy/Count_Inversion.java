public class Solution {

    public static int countInversionsBrute(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(countInversionsBrute(arr)); // 8
    }
}

//------------------------------------------------------------------
public class Solution {

    public static int countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;

            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;
        int count = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
                count += (mid - left + 1); // 🔥 main logic
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // copy back
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(countInversions(arr)); // 8
    }
}