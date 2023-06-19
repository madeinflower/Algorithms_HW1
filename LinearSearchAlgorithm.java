public class LinearSearchAlgorithm {
        public static int linearSearch(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] array = {5, 2, 8, 12, 7};
            int target = 8;
            int index = linearSearch(array, target);
            if (index != -1) {
                System.out.println("Element is found by index " + index);
            } else {
                System.out.println("Element is not found in the massive");
            }
        }

}
