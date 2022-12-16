public class Level1 {
    public static int[] trans(int[] ma, int n) {
        int[] maTemp = new int[n * n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int k = i + j;
                int max = 0;

                for (int t = j; t <= k; t++) {
                    if (ma[t] > max) {
                        max = ma[t];
                    }
                }

                if (max > 0) {
                    maTemp[count] = max;
                    count++;
                }
            }
        }

        int[] maTrans = new int[count];

        System.arraycopy(maTemp, 0, maTrans, 0, count);

        return maTrans;
    }

    public static boolean TransformTransform(int[] a, int n) {
        int[] b = trans(a, n);
        b = trans(b, b.length);

        int sum = 0;
        for (int j : b) {
            sum += j;
        }

        return sum % 2 == 0;
    }
}
