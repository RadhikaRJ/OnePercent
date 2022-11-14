class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=-99;
        
       
       for(int i=0;i<nums.length;i++){
            int numberOfConsecutiveOnes=0;
            while(i<nums.length && nums[i]==1){
                numberOfConsecutiveOnes++;
                i++;
            }
            
            if(max<numberOfConsecutiveOnes){
                max=numberOfConsecutiveOnes;
            }
        };
        
        return max;
    }
}