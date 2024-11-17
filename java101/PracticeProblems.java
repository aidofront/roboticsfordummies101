public class PracticeProblems {
	  public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,2,3,4,2,2};
        int n = 2;
        System.out.println(countOccurrences(arr,n));
    }

    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int number : arr) {
            if (number == n) {
                count++;
            }
        }
        return count;
    }
}
