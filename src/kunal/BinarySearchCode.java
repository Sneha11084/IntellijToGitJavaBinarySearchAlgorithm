package kunal;

public class BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = {1,3,4,56,78,89,98,678};
        int target = 98;
        System.out.println(binarySearchCode(arr, target));
    }

    static int binarySearchCode(int[] arr,int target){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(target > arr[mid]){
                s = mid + 1;
            } else if (target < arr[mid]) {
                e = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}