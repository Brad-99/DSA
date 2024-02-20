public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        // Continue until left and right pointers meet
        while (left < right) {
            // Calculate the width of the container
            int width = right - left;

            // Calculate the height of the container (minimum height of the two lines)
            int minHeight = Math.min(height[left], height[right]);

            // Calculate the area of the current container
            int area = width * minHeight;

            // Update the maximum area if the current area is greater
            maxArea = Math.max(maxArea, area);

            // Move the pointer with the smaller height towards the center
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum area for example 1: " + solution.maxArea(height1)); // Output: 49
        int[] height2 = {1, 1};
        System.out.println("Maximum area for example 2: " + solution.maxArea(height2)); // Output: 1
    }
}
