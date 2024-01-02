public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {3,5,6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void merge (int[] nums1, int m, int[] nums2, int n){
//        int p = m + n - 1;
//        int p1 = m - 1;
//        int p2 = n - 1;
//
//        while (p1 >= 0 && p2 >= 0){
//            if (nums1[p1] > nums2[p2]){
//                nums1[p] = nums1[p1];
//                p1--;
//                p--;
//            }else {
//                nums1[p] = nums2[p2];
//                p2--;
//                p--;
//            }
//        }
//
//        while (p2 >= 0){
//            nums1[p] = nums2[p2];
//            p2--;
//            p--;
//        }

        int p = m + n - 1; //k
        int p1 = m - 1;    //i
        int p2 = n - 1;    //j

        while (p2 >= 0){
            if (p1 >= 0 && nums1[p1] > nums2[p2]){
                System.out.println("nilai p1 didalam kondisi: " + p1);
                nums1[p] = nums1[p1];
                p--;
                p1--;
            }else {
                System.out.println("nilai nums1 dalam kondisi");
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }
        }



    }
}
