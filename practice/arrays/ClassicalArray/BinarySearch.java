public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Search(arr, 8));
    }

    public static int Search(int[] arr, int key) {
        int low = 0, high = arr.length - 1, mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}