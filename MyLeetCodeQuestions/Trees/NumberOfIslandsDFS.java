class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        
        int islandCount = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    islandCount += dfs(grid, i, j);
                }
            }
        }
        
        return islandCount;
    }
    
    public static int dfs(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return 0;
        
        grid[i][j] = '0'; // Setting visited islands to 0
        dfs(grid, i + 1, j); // Check neighbor that is down
        dfs(grid, i - 1, j); // Check neighbor that is up
        dfs(grid, i, j + 1); // Check neighbor to the right
        dfs(grid, i, j - 1); // Check neighbor to the left
        
        return 1;
    }
}
