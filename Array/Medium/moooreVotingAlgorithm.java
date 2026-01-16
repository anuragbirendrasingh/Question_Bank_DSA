package Array.Medium;

public class moooreVotingAlgorithm {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        int[] arr = { 3,2,3 };
        moore(arr);
    }

    public static void moore(int[] arr) {
        int n = arr.length;
        int ele = arr[0];
        int vote = 1;
        for (int i = 1; i < arr.length; i++) {
            if (ele == arr[i]) {
                vote++;
            } else {
                vote--;
                if (vote == 0) {
                    ele = arr[i];
                    vote = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }
        if (count > n / 2) {
            System.out.println(ele);
        } else {
            System.out.println("No majority element exist here");
        }

    }
}
