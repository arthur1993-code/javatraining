package loopsandarrays;

public class Task3 {
    public static void main(String[] args) {

        int[] a = {1, 5,6, 7};
        int[] b = {2, 4, 8, 9, 1, 7};
        int i;
        int n;
        for (i = 0; i < a.length; i++) {
            for (n = 0; n < b.length; n++)
                if (a[i] == b[n])
                    break;
            if (n == b.length)
                System.out.println(a[i]);

        }

    }

}




