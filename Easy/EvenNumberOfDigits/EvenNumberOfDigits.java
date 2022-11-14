package Easy.EvenNumberOfDigits;

class Solution {
    public int findNumbers(int[] nums) {
        
        int totalNumbersWithEvenNumberOfDigits=0;
       
        for(int i=0;i<nums.length;i++){
             int counter=0;
            int temp=nums[i]; //123
            while(temp!=0){         //12  1
                temp=temp/10; //12 1 
                counter++; //1 2 3
            }
            if(counter%2==0){
                totalNumbersWithEvenNumberOfDigits++;
            }
            
        }
        return totalNumbersWithEvenNumberOfDigits;
    }
}