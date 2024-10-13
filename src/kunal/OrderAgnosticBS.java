package kunal;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {45,34,23,11,8,4,0,-4} ;//{-3,1, 3, 4, 56, 78, 89, 98, 678};
        int target = 0;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        //check if asc or dsc
        boolean isAsc = arr[s] < arr[e];

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            //if Asc
            if (isAsc) {
                if (target > arr[mid]) {
                    s = mid + 1;
                } else if (target < arr[mid]) {
                    e = mid - 1;
                }
            }

            else {
                if (target < arr[mid]) {
                    s = mid + 1;
                } else if (target > arr[mid]) {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
