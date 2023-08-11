package Array_Programs;

public class demo1 {

	public static void main(String[] args) 
	{
		int nums[] = {12, 3, 5, 6, 87, 9};
		System.out.println(firstLast6(nums));

	}
	static public boolean firstLast6(int[] nums) {
		for(int i=0; i<nums.length-1;i++)
		{
			if(nums[0] == 6 || nums[nums.length - 1] == 6)
			    return true;
		}
		return false;
	}
}
