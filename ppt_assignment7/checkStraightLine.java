//<aside>
//💡 **Question 8**
//
//        You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
//
//        **Input:** coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
//
//        **Output:** true



package ppt_assignment7;

public class checkStraightLine {

        public static boolean checkStraightLine(int[][] coordinates) {
            if (coordinates.length <= 2) {
                return true; // If there are only 2 or fewer points, they always form a straight line
            }

            int[] point1 = coordinates[0];
            int[] point2 = coordinates[1];

            // Calculate the slope (m) of the line
            int deltaX = point2[0] - point1[0];
            int deltaY = point2[1] - point1[1];

            // Check if all other points lie on the same line
            for (int i = 2; i < coordinates.length; i++) {
                int[] currentPoint = coordinates[i];

                if (deltaX * (currentPoint[1] - point1[1]) != deltaY * (currentPoint[0] - point1[0])) {
                    return false; // If the points do not lie on the same line, return false
                }
            }

            return true; // All points lie on the same line
        }

        public static void main(String[] args) {
            int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
            boolean isStraightLine = checkStraightLine(coordinates);
            System.out.println(isStraightLine);
        }
    }


