public class DistinctSum {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 2,3 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isrepeted = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isrepeted = true;
                    break;
                }
            }

            if (!isrepeted) {
                boolean repeatedLater = false;
                for (int k = i + 1; k < a.length; k++) {
                    if (a[i] == a[k]) {
                        repeatedLater = true;
                        break;
                    }
                }
                if (!repeatedLater) {
                    sum += a[i];
                }
            }

        }
        System.out.println(sum);
    }
}