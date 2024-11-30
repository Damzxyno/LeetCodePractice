public class BubbleSortSolution {

    public void sort(int [] arr){
        if (arr == null){
            return;
        }

        while (true){
            boolean isSorted = true;
                for (int i = 0; i < arr.length - 2; i++){
                    if (arr[i] > arr[i + 1]){
                        isSorted = false;
                        swap(arr, i, i+ 1);
                    }
                }
            if (isSorted){
                break;
            }
        }
    }

    private void swap(int [] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
