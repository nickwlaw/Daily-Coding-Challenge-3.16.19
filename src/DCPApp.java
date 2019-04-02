import java.util.Arrays;

public class DCPApp {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3};
		System.out.println(Arrays.toString(nums));
		test2(nums);
		System.out.println(Arrays.toString(nums));

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
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j)
					nums[i] *= nums[j];
			}
		}
		return nums;
	}

}
