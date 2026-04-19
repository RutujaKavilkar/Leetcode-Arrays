
class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 3, 1};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > 2 * arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }}

        // --------------------------------
        //condition
        cnt=0, right=mid+1;
        for(int i=low;i<mid;i++)
        {
            while(right<=high && a[i]>2*a[right])
                right++;
            cnt=cnt+(right-(mid+1))
        }
        //-----------------------------------------


        public class Solution {

            public static int reversePairs(int[] arr) {
                return mergeSort(arr, 0, arr.length - 1);
            }

            private static int mergeSort(int[] arr, int low, int high) {
                int count = 0;

                if (low < high) {
                    int mid = (low + high) / 2;

                    count += mergeSort(arr, low, mid);
                    count += mergeSort(arr, mid + 1, high);
                    count += countPairs(arr, low, mid, high); // 🔥 extra step
                    merge(arr, low, mid, high);
                }

                return count;
            }}

            // 🔥 Count reverse pairs
            private static int countPairs(int[] arr, int low, int mid, int high) {
                int right = mid + 1;
                int count = 0;

                for (int i = low; i <= mid; i++) {
                    while (right <= high && (long) arr[i] > 2L * arr[right]) {
                        right++;
                    }
                    count += (right - (mid + 1));
                }

                return count;
            }

            // Normal merge
            private static void merge(int[] arr, int low, int mid, int high) {
                int[] temp = new int[high - low + 1];

                int left = low;
                int right = mid + 1;
                int k = 0;

                while (left <= mid && right <= high) {
                    if (arr[left] <= arr[right]) {
                        temp[k++] = arr[left++];
                    } else {
                        temp[k++] = arr[right++];
                    }
                }

                while (left <= mid) temp[k++] = arr[left++];
                while (right <= high) temp[k++] = arr[right++];

                for (int i = 0; i < temp.length; i++) {
                    arr[low + i] = temp[i];
                }
            }

            public static void main(String[] args) {
                int[] arr = {1, 3, 2, 3, 1};
                System.out.println(reversePairs(arr)); // Output: 2
            }
        }
