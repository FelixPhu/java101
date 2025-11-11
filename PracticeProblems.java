class main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4};
        int[] arr2 = {1,2,3,4};
        System.out.println("Problem 1: " + countOccurances(arr));
        System.out.println("Problem 2: " + java.util.Arrays.toString(reverseArray(arr2)));
    }
//problem 1
    static int countOccurances (int[] arr) {
        int count = 0;
        int number = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count = count + 1;
            }
        }
        return count;
    }
//problem 2
    static int[] reverseArray (int[] arr2) {

        for (int j = 0; j<arr2.length/2; j++) {
            int temp = arr2[j];
            arr2[j] = arr2[arr2.length-j-1];
            arr2[arr2.length-j-1] = temp;
        }
        return arr2;
    }

}
