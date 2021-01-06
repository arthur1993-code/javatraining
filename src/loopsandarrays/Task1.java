package loopsandarrays;


public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please specify the length of the array.\nBe sure to enter Whole number which is greater than or equal to 0!");
        int arrayLength = Help1.checkForPositiveInt();

        int[] arr = new int[arrayLength];
        System.out.printf("Please enter %d elements for the array. \nBe sure to enter only numbers!\n", arrayLength);

        for (int i = 0; i < arrayLength; i++)
            arr[i] = Help1.CheckForOnlyNumber();


        for (int i = arr.length - 1; i >= 0; i--)
            System.out.println(arr[i]);

    }
}
