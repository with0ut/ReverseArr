public class ReversingInt {

    public static int[] reverseInt(int[] arr, int k, int add) {
        int temp;
        for ( int n = k- add; n < k; n++ , k--){
            temp = arr[n];
            arr[n] = arr[k - 1];
            arr[k - 1] = temp;
        }
        return arr;
    }
    public static void reversMain(int[] arr, int k){
        int n;
        int add = k;

        for (int j = 0; k <= arr.length; j++) {
            arr = reverseInt(arr, k, add);
            k = k + add;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 2;

        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        reversMain(arr, k);

        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
