class BubbleSort {
    public static void main(String args[]) {
        BubbleSort example1 = new BubbleSort();
        int arr[] = { 4, 1, 3, 9, 7 };
        example1.bubbleSort(arr);
        example1.printArray(arr);
    }

    void bubbleSort(int array[]) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap = true;
                    int num = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = num;
                }
            }
        }
    }

    void printArray(int array[]) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
    }
}