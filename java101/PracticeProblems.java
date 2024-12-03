public class PracticeProblems {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,1,3,3,4,5,2};
      int n = 3;
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

public class PracticeProblems {
  public static void main(String[] args) {
      int[] arr = {1,2,3};
      int[] reverseArr= reverseArray(arr);

      for (int num : reverseArr) {
          System.out.println(num);
      }
}
public static int[] reverseArray(int[] arr) {
  int[] reverse = new int[arr.length];
  for(int i = 0; i < arr.length;i++) {
      reverse[i]= arr[arr.length - 1 - i];
      }
      return reverse;
  }
}  
  
public class PracticeProblems {
  public static void main(String [] args) {
      double[][] grid = {
          {1.1, 2.2, 3.3},
          {4.0, 5.0, 6.0},
          {7.4, 8.5, 9.6}
      };

       double total = sumGrid(grid);
      System.out.println(total);
  }

  public static double sumGrid(double[][] grid) {
      double sum = 0.0;

      for (int i = 0; i < grid.length; i++) {
          for (int j = 0; j < grid[i].length; j++) {
              sum += grid[i][j]; 
          }
      }
      return sum;
  }
}

public class PracticeProblems {
  public static void main(String [] args) {
     int n = 5;
     int result = fib(n);
     System.out.println(result); 
  }

public static int fib(int n) {
  if (n == 0) return 0;
  if (n == 1) return 1;

  int a = 0, b = 1;
  int fib = 0;

  for (int i = 2; i <= n; i++) {
      fib = a + b;
      a = b;
      b = fib;
  }
  return fib;
  }
}

