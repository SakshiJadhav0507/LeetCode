class Solution {
    public int trap(int[] height) {

        int len = height.length;

        int[] leftmax = new int[len];
        int[] rightmax = new int[len];

        leftmax[0] = height[0];
        rightmax[len - 1] = height[len - 1];

        // Maximum height from left
        for (int i = 1; i < len; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        // Maximum height from right
        for (int i = len - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }

        int trappedWater = 0;

        // Calculate water at every index
        for (int i = 0; i < len; i++) {
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
}