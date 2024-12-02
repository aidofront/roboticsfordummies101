package java102;

//diagonal practice
import java.util.ArrayList;

public class Grid<T> {
    private T[][] grid; 

    public ArrayList<T> diagonal() {
        ArrayList<T> diagonal = new ArrayList<>();
        int rows = grid.length;

        for (int i = 0; i < rows; i++) {
            if (i < grid[i].length); {
            diagonal.add(grid[i][i]);
            }
        }
        return diagonal;
    } 
}

//maxSlideLength practice
public class Grid<T> {
    private T[][] grid; 
    private static int maxSideLength = 0;

    public Grid(T[][] grid) {
        this.grid = grid;
        int  sidelength = Math.max(grid.length, grid[0].length);
        if (sidelength > maxSideLength) {
        maxSideLength = sidelength;
    }
}
public static int maxSideLength() {
    return maxSideLength;
    }
}

//availableitems practice
public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
    ArrayList<LibraryItem> available = new ArrayList<>();
    for (LibraryItem item : items) {
        if (item.isAvailable()) {
            available.add(item);
        }
    }
    return available;
}

