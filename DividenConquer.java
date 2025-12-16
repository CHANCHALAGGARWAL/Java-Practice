public class DividenConquer {
    public static int findElement(int[] arr, int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return findElement(arr, tar, si, mid - 1);
            } else {
                return findElement(arr, tar, mid + 1, ei);
            }
        }
        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return findElement(arr, tar, mid + 1, ei);
            } else {
                return findElement(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 1;
        int result = findElement(arr, tar, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
