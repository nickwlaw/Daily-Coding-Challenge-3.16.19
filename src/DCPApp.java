import java.util.Arrays;

public class DCPApp {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3};
		System.out.println(Arrays.toString(nums));
		int[] numsAltered = test2(nums);
		System.out.println(Arrays.toString(numsAltered));

	}
	
	// set new values by dividing each index from multiplication of all indexes
	static int[] test1(int[] nums) {
		
		int total = nums[0];
		for (int i = 0; i < nums.length; i++) {
			total *= nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = total / nums[i];
		}
		return nums;
	}
	
	// set new values by multiplying each index by each other index -- NOT WORKING PROPERLY
	static int[] test2(int[] nums) {
	
		int[] numsAltered = nums.clone();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j)
					numsAltered[i] *= nums[i];
			}
		}
		return numsAltered;
	}

}

/* Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers 
 * in the original array except the one at i.
 * 
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1],
 * the expected output would be [2, 3, 6].
 * 
 * Follow-up: what if you can't use division?
 * 
 */