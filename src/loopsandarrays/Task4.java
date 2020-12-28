package loopsandarrays;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 2, 5, 66, 66,  87, 1, 37, 1, 1};
        int a = arr.length;
        int[] arr2 = new int[a];
        int k = 2;
        int c = 0;
        int j = 0;
        for (int i = 0; i < a; i++) {

            c = 0;
            for (int n = 0; n < a; n++) {
                if (arr[i] == arr[n])
                    c += 1;
            }
            if (c == k)
                break;
                arr2[j++] = arr[i];
            System.out.println(arr[i]);
        }

    }

}
