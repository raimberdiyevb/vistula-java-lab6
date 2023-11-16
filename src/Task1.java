import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 18, 70, 20, 33, 45, 55, 57, 72, 86};
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        //int[] array = new int[]{43, 432, 4654, 6, 24, 236, 78, 9, 7543, 525};
        task2(array);
    }
    public static void task2(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            count++;
            if(arr[i] > arr[i + 1]) {
                for (int j = i + 1; j < arr.length; j++) {
                    count++;
                    if (arr[i] > arr[j]) {
                        count++;
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("COUNT : " + count);
    }
    public static void task1(int[] array){
        for (int i = 0; i <array.length-1; i++) {
            if(array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}