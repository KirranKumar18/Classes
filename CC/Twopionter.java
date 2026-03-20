 class Twopionter {
    public static void main(String[] args) {
        int n=6;
        int[] arr= {2,5,8,12,15,20};
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            System.out.print(arr[left]+" ");
            System.out.print(arr[right]+" ");
            left++;
            right--;
        }
    }
}
