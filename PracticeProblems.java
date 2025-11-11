//First name: Felix

public class PracticeProblems{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4};
        int[] arr2 = {1,2,3,4};
        int[][] arr3 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n = 25;
        System.out.println("Problem 1: " + countOccurances(arr));
        System.out.println("Problem 2: " + java.util.Arrays.toString(reverseArray(arr2)));
        System.out.println("Problem 3: " + gridSum(arr3));
        System.out.println("Problem 4: " + fib(n));
    }
// Problem 1
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
// Problem 2
    static int[] reverseArray (int[] arr2) {

        for (int j = 0; j<arr2.length/2; j++) {
            int temp = arr2[j];
            arr2[j] = arr2[arr2.length-j-1];
            arr2[arr2.length-j-1] = temp;
        }
        return arr2;
    }
// Problem 3
    static int gridSum (int[][] arr3) {
        int sum = 0;
        for (int k = 0; k< arr3.length; k++){
            for (int l = 0; l< arr3[k].length; l++){
                sum += arr3[k][l];
            }
        }
        return sum;
    }
// Problem 4
    static int fib (int n){
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
