public class Main {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4};
        int n=arr.length;
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        if (arr[0] != arr[1]) {
            System.out.println(arr[0]);
            return;
        }
        if (arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1]);
            return;
        }
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            int pre = mid - 1;
            int nxt = mid + 1;

            // Use bounds to avoid index out of range
            if (pre < 0) pre = Integer.MAX_VALUE; // Set to max to avoid comparison
            if (nxt >= n) nxt = Integer.MAX_VALUE; // Set to max to avoid comparison

            if (arr[mid] != arr[nxt] && (pre < 0 || arr[pre] != arr[mid])) {
                System.out.println(arr[mid]);
                return;
            } else if (arr[mid] == arr[nxt]) {
                left = mid + 2;
            } else {
                right = mid - 2;
            }
        }
        System.out.println(-1);
    }
}

