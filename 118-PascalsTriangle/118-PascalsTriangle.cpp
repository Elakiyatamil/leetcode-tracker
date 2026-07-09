// Last updated: 09/07/2026, 09:53:26
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        // Create a matrix (2D vector)
        vector<vector<int>> dp(numRows, vector<int>(numRows, 0));

        // Build Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            dp[i][0] = 1;       // first element
            dp[i][i] = 1;       // last element

            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        // Prepare result with exact row sizes
        vector<vector<int>> result;
        for (int i = 0; i < numRows; i++) {
            vector<int> row;
            for (int j = 0; j <= i; j++) {
                row.push_back(dp[i][j]);
            }
            result.push_back(row);
        }

        return result;
    }
};
