package Array.Striver.BS;

public class first_and_LastOccur {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int x = 8 ;
        int[] ans = index_of_element(arr, x);
        for(int num : ans){
            System.out.print(num + " ");
        }


    }
    public static int[] index_of_element(int[] arr,int x){
        int first = Lower_Bound(arr, x);
        int last = Upper_Bound(arr, x)-1;
        if(first==arr.length || arr[first]!=x){
            return new int[]{-1,-1};
        }
        return new int[] {first,last};
    }

    public static int Lower_Bound(int[] arr ,int x){
        int lo = 0 ;
        int hi = arr.length-1;
        int ans = arr.length ;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=x){
                ans = mid ;
                hi = mid- 1;
            }
            else{
                lo = mid + 1; 
            }
        }
        return ans ;
    }

    public static int Upper_Bound(int[] arr,int x){
               int lo = 0 ;
        int hi = arr.length-1;
        int ans = arr.length ;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>x){
                ans = mid ;
                hi = mid- 1;
            }
            else{
                lo = mid + 1; 
            }
        }
        return ans ;
    }


}
