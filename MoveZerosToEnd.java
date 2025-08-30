public class MoveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Step 2: Fill remaining positions with 0
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        
        System.out.println("Before moving zeros:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        moveZeroes(arr);

        System.out.println("\nAfter moving zeros:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
