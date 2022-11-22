package GreedyAlgorithms.Disjoint_Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class Disjoint_intervals {
    
        public int solve(int[][] A) {
         
         //sorting the array A on the basis of interval's end point
         int temp_ll, temp_ul;
         
        //  for(int i=0;i<A.length-1;i++){
        //      if(A[i][1]>A[i+1][1]){
        //          temp_ll=A[i][0];
        //          temp_ul=A[i][1];
        //          A[i][0]=A[i+1][0];
        //          A[i][1]=A[i+1][1];
        //          A[i+1][0]=temp_ll;
        //          A[i+1][1]=temp_ul;
        //          i=-1;
        //      }
        //  } 
        
        
        //Inbuilt arrays sort function is used & overriden to sort as per col1
        Arrays.sort(A, new Comparator<int[]>(){
            @Override
            public int compare(final int[] entry1, final int[] entry2){
                if(entry1[1]>entry2[1])
                return 1;
                else return -1;
            }
        });
         
         int prev_s=A[0][0], prev_e=A[0][1];
         int count=1;
         for(int i=0;i<A.length;i++){
             int s=A[i][0], e=A[i][1];
             if(s<=prev_e){
                 continue;
             }
             else{
                 prev_s=A[i][0];
                 prev_e=A[i][1];
                 count++;
             }
         }
         return count++;
         
         
        
    }
    
}
