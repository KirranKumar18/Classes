class arrTotal{
    public static void main(String[] args) {
        int[] arr = {100 ,50 ,20 ,10};
        int[] qty= {2 ,5 ,3 ,4};
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i]*qty[i];
        }

        System.out.println("Total: " + total);
    }
}