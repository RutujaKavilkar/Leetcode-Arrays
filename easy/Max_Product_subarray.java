class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int product = 1;

            for(int j = i; j < n; j++) {
                product *= arr[j];
                maxi = Math.max(maxi, product);
            }
        }

        return maxi;


        //-------------------------------------------
        class Solution {
            public int maxProduct(int[] arr) {
                int n = arr.length;
                int pre = 1, suff = 1;
                int ans = Integer.MIN_VALUE;

                for(int i = 0; i < n; i++) {

                    if(pre == 0) pre = 1;
                    if(suff == 0) suff = 1;

                    pre *= arr[i];
                    suff *= arr[n - i - 1];

                    ans = Math.max(ans, Math.max(pre, suff));
                }

                return ans;
            }
        }
    }
}