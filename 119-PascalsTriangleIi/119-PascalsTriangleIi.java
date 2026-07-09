// Last updated: 09/07/2026, 09:53:25
import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        // initialize all values as 0
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0);
        }

        row.set(0, 1); // first element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            // update from right to left
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}
