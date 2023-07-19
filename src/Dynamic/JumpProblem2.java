package Dynamic;

import java.util.Arrays;

public class JumpProblem2 {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,9999);
        dp[nums.length-1] = 0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==0){
                dp[i] = Integer.MAX_VALUE;
                continue;
            }
            for(int j = 1;j<=nums[i];j++){
                if(i+j > nums.length-1){
                    continue;
                }

                dp[i] = Math.min(dp[i+j],dp[i])+1;
            }
            // dp[i] += 1;
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] input = {2,3,0,1,4};
        System.out.println(new JumpProblem2().jump(input));
    }
}
