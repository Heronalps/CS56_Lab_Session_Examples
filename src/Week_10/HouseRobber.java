public class HouseRobber {
    public int rob(int[] nums) {
        int[][] cash = new int[nums.length + 1][2];
		for (int i = 0; i < nums.length; i++) {
			cash[i + 1][0] = cash[i][1] + nums[i];
			cash[i + 1][1] = Math.max(cash[i][0], cash[i][1]);
		}
		return Math.max(cash[nums.length][0], cash[nums.length][1]);
    }
}