class MostWater {
    public int maxArea(int[] height) {
        int left = 0;                    // start pointer
        int right = height.length - 1;   // end pointer
        int maxArea = 0;

        while (left < right) {
            // Find current area
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;
            max area .max(maxArea, area);

            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    // For testing
    public static void main(String[] args) {
        MostWater obj = new MostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height)); // Output: 49
    }
}
