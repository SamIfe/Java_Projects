package sortChalenges;

public class SortingChallenges {

    public static void quicksort(int [] numbers, int start, int end) {
        if(start < end) {
            int partitionIndex = partition(numbers, start, end);
            quicksort(numbers, start, partitionIndex - 1);
            quicksort(numbers, partitionIndex + 1, end);
        }

    }

    public static int  partition(int [] numbers, int start, int end) {
        int pivot = numbers[end];
        int currentIndex = 0;
        for (int index = start; index < end; index++) {
            if(numbers[index] < pivot) swap(numbers, index, currentIndex);
            currentIndex++;
        }

        swap(numbers, currentIndex, end);
        return currentIndex;
    }
    private static void swap(int[] numbers, int index, int currentIndex) {
        int temp = numbers[index];
        numbers[currentIndex] = numbers[index];
        numbers[index] = temp;
    }

    public static int[] findMaxProduct(int[] numbers){
        quicksort(numbers, 0, numbers.length - 1);
        int firstElement = numbers[0];
        int secondElement = numbers[1];
        int secondToTheLastElement = numbers[numbers.length - 2];
        int lastElement = numbers[numbers.length - 1];
        if ((secondElement * firstElement) > (lastElement * secondToTheLastElement))
            return new int[]{firstElement, secondElement};
        return new int[]{secondToTheLastElement, lastElement};

    }
}
