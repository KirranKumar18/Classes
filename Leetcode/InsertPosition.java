package Leetcode;

public class InsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int left = 0;
        int right = arr.length-1;  // 3
        int mid=0;
        int target = 7;
        while(left<=right){
            mid = left  +(right - left)/2;
            if(arr[mid]>target)
                right=mid-1;
            else
                left=mid+1;
    }
    System.out.println(left);
  }
}
