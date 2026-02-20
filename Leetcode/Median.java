class Median{
    public static void main(String[] args) {
     System.out.println("Hello World");
     int[] nums1={1,3};
     int[] nums2={2,4};
    
     int left=0;
     int right=0;
     double res=0.0000;
    
    if((nums1.length+nums2.length)%2==0){
        int des=(nums1.length+nums2.length)/2;
        int predes=0;
        while ((left+right)<des) {
            if(nums1[left]<nums2[right]){
                des=nums2[right];
                predes=des;
                System.out.println(des+" "+predes);
                right++;
            }}}

/* 
            else{
                 int des=(nums1.length+nums2.length)/2;
        int predes=0;
                 while ((left+right)<=des) {
            if(nums1[left]>nums2[right]){
                des=nums1[left];
                predes=des;
                System.out.println(des+" "+predes);
                left++;
            }
                
            }*/
            
        }
    }

    


    

