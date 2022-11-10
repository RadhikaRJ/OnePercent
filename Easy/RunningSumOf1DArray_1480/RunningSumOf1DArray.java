package Easy.RunningSumOf1DArray_1480;

public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        //1st solution
        //int[] sol = new int[nums.length];
       //System.out.println(sol.length);
        //for(int i=0; i<nums.length;i++){
            //int sum=0;
           // for(int j=0;j<=i;j++){
            //    sum = sum + nums[j];
           // }
           // sol[i]=sum;
        //}
        //return sol;
        
        //Time complexity O(n^2)
        //Space Complexity O(n)
        
        //2nd solution
        //int[] sol = new int[nums.length];
        //sol[0]=nums[0];
        //for(int i=1;i<nums.length;i++){
           // sol[i]=nums[i]+sol[i-1];
        //}
       // return sol;
        
         //Time complexity O(n)
        //Space Complexity O(n)
        
        //3rd solution
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        
        return nums;
        
         //Time complexity O(n)
        //Space Complexity O(1)
    }
}
