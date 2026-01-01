package TwoPointers;

public class sumII_167 {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int tar = 9;
       int[] temp =  Find_Sum(arr, tar);
        for(int num :temp){
            System.out.println(num + " ");
        }
    }

    public static int[] Find_Sum(int[] arr, int tar) {
        int i = 0;
        int j = arr.length - 1;
        int[] temp = new int[2];

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum < tar) {
                i++;
            } else if (sum > tar) {
                j--;
            } else if (sum == tar) {
                // System.out.println(i + " " + j);
                temp[0] = i+1;
                temp[1] = j+1;
                break;
            }

        }
        return temp;

        
    }
}
