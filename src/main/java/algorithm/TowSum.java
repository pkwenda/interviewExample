//package algorithm;
//
//<<<<<<< HEAD
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author wenda.zhuang
// * @Date 2020/5/22 00:59
// * @Description 两数之和：https://leetcode-cn.com/problems/two-sum/
// * @E-mail sis.nonacosa@gmail.com
// */
//public class TowSum {
//
//	public int[] twoSum(int[] nums, int target) {
//		if(nums.length == 2) return new int[]{0,1};
//		Map<Integer,Integer> map = new HashMap();
//
//
//		for (int i = 0; i < nums.length; i++) {
//			if(!map.containsKey(target - nums[i])) {
//				map.put(nums[i],i);
//			}
//			else {
//				return new int[] {map.get(target - nums[i]),i};
//			}
//		}
//		return new int[] {};
//	}
//
//	public static void main(String[] args) {
//		int[] xx = new TowSum().twoSum(new int[]{ 11,2, 152, 7},9);
//		System.out.println(xx);
//=======
///**
// * @author wenda.zhuang
// * @Date 2020/5/22 1:06 PM
// * @Description 两数之和
// * @E-mail sis.nonacosa@gmail.com
// */
//public class TowSum {
//	public int[] twoSum(int[] nums, int target) {
//
//		return null;
//	}
//
//	public static void main(String[] args) {
//		new TowSum().twoSum(new int[] {},9);
//>>>>>>> 0c1a00c2c1858b23345ddedd2d2c79514bd537ce
//	}
//}
