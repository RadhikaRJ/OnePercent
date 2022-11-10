package Easy.TwoSum_1;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int indices[]=new int[2];

        //Brute Force
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j]==target){
        //             indices[0]=i;
        //             indices[1]=j;
        //             return indices;
        //         }
        //     }
        // }
        //Time Complexity O(n^2)


        //Two pointer method
        //Sort the array in O(n) time complexity
        // Store sorted array values in different array

        int numsSorted[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            numsSorted[i]=nums[i];
        }

        for(int i=0;i<numsSorted.length-1;i++){
            if(numsSorted[i]>numsSorted[i+1]){
                int temp=numsSorted[i];
                numsSorted[i]=numsSorted[i+1];
                numsSorted[i+1]=temp;
               i=-1;
            }
        }

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        int flag=0;
        int m=0, j= nums.length-1;
        
        // //O(N) solution using pointers
        while(flag==0){
           if(numsSorted[m]+numsSorted[j]==target){
               int ind1=-99,ind2=-99;
                 //System.out.println("sum equal to target nums[i]: "+nums[m]+" nums[j]: "+nums[j]+" m: "+m+" j: "+j);
                for(int i=0;i<nums.length;i++)
                {
                    if(numsSorted[m]==numsSorted[j]){
                        if(numsSorted[m]==nums[i] && ind1==-99){
                            ind1=i;
                            
                        }
                        if(nums[i]==numsSorted[j] && ind1!=i){
                            ind2=i;
                        }
                    }
                    else{
                        if(numsSorted[m]==nums[i]){
                            ind1=i;
                        }
                        if(numsSorted[j]==nums[i]){
                            ind2=i;
                        }
                    }
                   
                }

                indices[0]=ind1;
                indices[1]=ind2;
               flag++;
            }
            else if(numsSorted[m]+numsSorted[j]<target){
                m=m+1;
            }
            else if(numsSorted[m]+numsSorted[j]>target){
                j=j-1;
            }
          
           
        };
      
        return indices;
    }
}