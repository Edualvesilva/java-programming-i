
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = {3, 10, 5, 99, 3, 12};
        //System.out.println(smallest(array));
        //System.out.println(indexOfSmallest(array));

        // int[] numbers = {-1, 6, 9, 8, 12};
        //System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        //System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int numbers : array) {

            if (numbers < smallest) {
                smallest = numbers;
            }
        }

        return smallest;

    }

    public static int indexOfSmallest(int[] array) {
        int index = array[0];
        int small = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == small) {
                index = i;
            }

        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;

        int small = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < small) {
                index = i;
                small = table[i];
            }
        }

        return index;

    }

    public static void swap(int array[], int index1, int index2) {

        int hold = array[index1];
        array[index1] = array[index2];
        array[index2] = hold;
    }

    public static void sort(int array[]) {
        int small;
        int index = 0;
        for (int i = index; i < array.length - 1; i++) {

           small =  indexOfSmallestFrom(array, i);
            swap(array, small, i);
        }

    }

}
