package Easy.Duplicate_zeroes;

public class duplicateZeroes {
    public static void main(String[] args) {
    int arr[]= {1,0,2,3,0,4,5,0};

    for(int i=0;i<arr.length-1;i++){
           
        if(arr[i]==0)        
         {
         int j=arr.length-2;
            
            while(j>i){
               System.out.println("j: "+j);
                arr[j+1]=arr[j];
                j--;
            };
           System.out.println("arr i:= "+arr[i]+"i= "+i);
           arr[i+1]=0;
           i=i+1;
        }
         
       
    }

    for(int x: arr){
            System.out.println(x);
    }
    }
}
