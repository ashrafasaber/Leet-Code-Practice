import java.util.Arrays;

// https://leetcode.com/problems/two-sum/description/
// Given an array of integers, return indices of the two numbers such 
//that they add up to a specific target.
//You may assume that each input would have exactly one solution, 
//and you may not use the same element twice.
//
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

public class Solution {
	public static int[] twoSum(int[] nums, int target) {
		int x,y,sum;
		boolean targetFound=false;
		int[] returnValue={0,0};
		for(int i=0;i<nums.length;i++){
			x=nums[i];
			for(int j=i+1;j<nums.length;j++){
				y=nums[j];
				sum = x+y;
				if(sum==target)
				{
					targetFound=true;
					returnValue[0]=i;
					returnValue[1]=j;
					break;
				}
			}
			if(targetFound){break;}
		}
		return returnValue;

	}

	public static void main(String[] args)
	{
		int[] input ={3,2,4};
		int target=6;
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(twoSum(input,target)));
	}
}

