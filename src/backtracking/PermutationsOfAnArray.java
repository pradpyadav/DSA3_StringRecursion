package backtracking;

public class PermutationsOfAnArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2,3};
        permutate(arr, 0, arr.length - 1);

    }

    static void permutate(int arr[], int l, int r) {

        if (l == r) {
            printArray(arr);
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(arr,i,l);
            permutate(arr,l+1,r);
            swap(arr,i,l);
        }
    }

    static void swap(int arr[],int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
