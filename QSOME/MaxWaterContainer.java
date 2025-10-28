package QSOME;

public class MaxWaterContainer {
    public static void main(String[] args) {
        int[] height = {1,1};
        int maxArea = maxWater(height);
        System.out.println("Maximum water area: " + maxArea);
    }

    public static int maxWater(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Height is determined by the shorter line
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            maxArea = Math.max(maxArea, area);

            // Move the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
