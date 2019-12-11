import java.util.*;
public class FindPeakElement{
	public static void main(String[] args){
		final Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=cin.nextInt();
		}
		System.out.println(peakIndex(nums));
	}
	public static int PeakIndex(int[] nums){
		//brute forxece -O(n)
		for(int i=1;i<nums.length;i++){
			if(nums[i]<nums[i-1]){
				return i-1;
			}
		}
		if(nums[nums.length-2]==nums[nums.length-1]){
			return nums.length-2;
		}
		return nums.length-1;
	}
	// 0 1 2 3 4 5
	// 1 2 3 4 1 5 
	// 1 2 3 4 1 5 -> mid =2(3)
	// 3 > 4 and 3 > 2 -> return mid
	// check mid-> mid -1(2) -> left mid+1
	// right => mid -1
	public static int peakIndex(int[] nums){
		int left=0,right=nums.length-1;
		while(left<=right){
			int mid=(left+right)/2;
			if((nums[mid]>nums[mid-1] && mid>0) && (mid<nums.length && nums[mid]>nums[mid+1])){
				return mid;
			}else if(mid-1>=0 && nums[mid]>nums[mid-1]){
				left=mid+1;
			}
			else if(mid+1<nums.length && nums[mid]<nums[mid+1]){
				right=mid-1; 
			}
		}
		return -1;
	}
}
