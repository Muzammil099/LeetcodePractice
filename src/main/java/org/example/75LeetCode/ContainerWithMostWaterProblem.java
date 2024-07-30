import java.lang.*;
class Solution {

    //https://www.code-recipe.com/post/container-with-most-water

    //using two pointer approach to get the max area
    // move either left or right decide based on value at each index
    // index with lower value will move

    public int maxArea(int[] height) {
        
        int start = 0 ;
        int end = height.length -1;
        int maxHeight = 0;

        while(start < end){

            maxHeight = Math.max(maxHeight, Math.min(height[start], height[end]) * (end - start));

            if(height[start] > height[end]){
                end--;
            }
            else{
                start++;
            }

        }

        return maxHeight;

    }
}