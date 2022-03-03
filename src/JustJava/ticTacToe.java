package JustJava;


public class ticTacToe {
    public static void main(String args[]) {

        int[] array = {-3, 0, 1, 3, 4};
        int k = 5;

        twoSum(array, k);

        for (int i = 0; i < twoSum(array, k).length; i++){
            System.out.println(twoSum(array, k)[i]);
        }

    }

    private static int[] twoSum(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        while (l < r){
            int sum = nums[l] + nums[r];
            if (sum == k){
                return new int[]{nums[l], nums[r]};
            }
            if (sum < k){
                l++;
            }else {
                r--;
            }
        }
        return new int[0];
    }
}

