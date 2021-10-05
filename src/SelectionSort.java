public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 2, 66, 6};
        selectionSort(arr);

        for (int e: arr){
            System.out.println(e);
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
