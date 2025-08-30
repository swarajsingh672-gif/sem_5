public class TrappingRainWater {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];  // update left maximum
                } else {
                    water += leftMax - height[left];  // trapped water
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];  // update right maximum
                } else {
                    water += rightMax - height[right];  // trapped water
                }
                right--;
            }
        }

        return water;
    }

    // Testing
    public static void main(String[] args) {
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height2 = {4,2,0,3,2,5};

        System.out.println("Water trapped: " + trap(height1)); // Output: 6
        System.out.println("Water trapped: " + trap(height2)); // Output: 9
    }
}

