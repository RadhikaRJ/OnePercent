package Hard.MedianOfTwoSortedArrays;

public class MedianOfTwoSortedArrays {
    
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int mergedArrayLength=nums1.length+nums2.length;
            int mergedArray[]=new int[mergedArrayLength];
    
            int i=0,j=0,k=0;
            double median=0;
    
            
            while(k<mergedArrayLength){
                if(i<nums1.length && j<nums2.length){
                        if(nums1[i]<= nums2[j])
                        {
                        mergedArray[k]=nums1[i];
                        i++;
                        k++;
                    }
                    else if(nums1[i]>nums2[j])
                    {
                        mergedArray[k]=nums2[j];
                        j++;
                        k++;
    
                    }
                }
                
                if(i==nums1.length || j==nums2.length){
                    break;
                }
            }
    
            if(i<nums1.length){
                while(i<nums1.length){
                    mergedArray[k]=nums1[i];
                    i++;
                    k++;
                }
            }
            else{
                while(j<nums2.length){
                    mergedArray[k]=nums2[j];
                    j++;
                    k++;
                }
            }
    
    for(int m=0;m<mergedArrayLength;m++){
        System.out.println(mergedArray[m]);
    }
            int a= mergedArrayLength/2;
            int b= a-1;
            if(mergedArrayLength%2==0){
               
              median=mergedArray[a]+mergedArray[b];
              median=median/2;
    
            }
            else {
                median=mergedArray[a];
            }
    
            return median;
        }
}

