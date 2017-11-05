

/*
 *Given a 32-bit signed integer, reverse digits of an integer.
Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers 
within the 32-bit signed integer range. For the purpose of this problem, 
assume that your function returns 0 when the reversed integer overflows.

link: https://leetcode.com/problems/reverse-integer/description/
 */

public class Solution {
	public static int reverse(int x) {
		int remainder=0, reversed=0,temp=0;
		while(x!=0)
		{
			remainder=x%10;
			temp = reversed*10+remainder;
			if((temp-remainder)/10!= reversed){
				return 0;
			}        
			reversed=temp;
			x=x/10;
		}
		return reversed;
	}
	
	public static void main(String[] args){
		int n1=123, n2=12345678, n3=1000;
		 
		System.out.println(reverse(n1)); // 321
		System.out.println(reverse(n2)); // 87654321
		System.out.println(reverse(n3)); // 1
	}
}


