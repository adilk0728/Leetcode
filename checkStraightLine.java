// You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

// Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
// Output: true

// Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
// Output: false

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int numRows = coordinates.length;
        
        float xCoor = Math.abs((coordinates[0][0] - coordinates[1][0]));
        float yCoor = Math.abs((coordinates[0][1] - coordinates[1][1]));
        
        float slopeInit = yCoor/xCoor;
        float slope = 0.0f;
        
        
        
        for(int row = 0; row < numRows - 2; row++){
            
            xCoor = Math.abs((coordinates[0][0] - coordinates[row+2][0]));
            
            yCoor = Math.abs((coordinates[0][1] - coordinates[row+2][1]));
             
            
            slope = yCoor/xCoor;
            System.out.println(slope);
            
            if((slopeInit != slope)){
                return false;
            }   
        }
        
        return true;
    }
}