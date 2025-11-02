package Array.Basic;

public class delete_item_manually {
    public static void main(String[] args) {
        int[] arr  = {10,20,30,40,50};
        int n = arr.length;
        int item = 30 ;
        int index = -1 ;

        for(int i=0 ; i<arr.length ;i++){
            if(arr[i] == item){
               index = i ;
               break;
            }

         
        }

        if(index!=-1){
            for(int k = index ; k<n-1 ;k++){
                arr[k] = arr[k+1];
            }
        }

        n--;

        for(int i=0 ; i< n;i++){
            System.out.print(arr[i] +  " ");
        }

        

    }
}
