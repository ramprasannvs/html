/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
public class Twosum {
    public int[] twoSum(int nums[], int target) {
        int[] answer = new int[2];
       int i=0;
       while( i < nums.length){
           int j=i+1;
           while( j < nums.length) {
            // j = i + 1; no need to check back elements it covers in i;
               if(nums[i] + nums[j] == target) {
                   answer[0] = i;
                   answer[1] = j;
                   return answer;
                   
               }
               j++;
               
           } 
           i++;
       }
         return null;
    

    
}
}
