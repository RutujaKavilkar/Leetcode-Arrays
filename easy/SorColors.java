class Solution {

    public void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//-------------------------------------------------------------------------------------

    int count0 = 0;
    int count1 = 0;
    int count2 = 0;
    int n = arr.length;
 for(
    int i = 0;
    i<n;i++)

    {
        if (arr[i] == 0) {
            count0++;
        } else if (arr[i] == 1) {
            count1++;
        } else {
            count2++;
        }
    }
 for(
    int i = 0;
    i<count0;i++)

    {
        arr[i] = 0;
    }

 for(
    int i = count0;
    i<count1+count0;i++)

    {
        arr[i] = 1;
    }
 for(
    int i = count0 + count1;
    i<n;i++)

    {
        arr[i] = 2;
    }

// ---------------------------------------------------------------------
}

}