package dungeon_game;

import java.util.Scanner;

public class ShortestPathInGold {

    static int shortestPath(int[][] dungeon, int AdventurerRow, int AdventurerCol, int goldRow, int goldCol) {
        int steps = 0;
        int currentX =  AdventurerRow;
        int currentY =AdventurerCol;

        while (currentX != goldRow || currentY != goldCol) {
            if (currentX <goldRow ) {
                currentX++;
            } else if (currentX > goldRow ) {
                currentX--;
            } else if (currentY <goldCol) {
                currentY++;
            } else if (currentY > goldCol) {
                currentY--;
            }

            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        int[][] dungeon= {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        
        System.out.println("Enter the AdventurerRow and AdventurerCol");
        int AdventurerRow = in.nextInt(); //5;
        int AdventurerCol = in.nextInt(); //1;
        
        System.out.println("Enter the GoldRow and GoldCol");
        int goldRow = in.nextInt();  //1;
        int goldCol = in.nextInt();  //4;

        int steps = shortestPath(dungeon,  AdventurerRow, AdventurerCol, goldRow, goldCol);
       
            System.out.println("Minimum number of steps: " + steps);
      
    }
}
