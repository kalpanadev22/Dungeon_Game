//question 2


package dungeon_game;

import java.util.Scanner;

public class ShortestPathInGold {

	 static int shortestPath(int[][] dungeon, int adventurerRow, int adventurerCol, int goldRow, int goldCol, int monsRow, int monsCol) {
	        int steps = 0;
	        int currentX = adventurerRow;
	        int currentY = adventurerCol;

	        while (currentX != goldRow || currentY != goldCol) {
	            if (currentX < goldRow && !(currentX + 1 == monsRow && currentY == monsCol)) {
	                currentX++;
	            } else if (currentX > goldRow && !(currentX - 1 == monsRow && currentY == monsCol)) {
	                currentX--;
	            } else if (currentY < goldCol && !(currentX == monsRow && currentY + 1 == monsCol)) {
	                currentY++;
	            } else if (currentY > goldCol && !(currentX == monsRow && currentY - 1 == monsCol)) {
	                currentY--;
	            }

	            steps++;
	            
	            if (steps > dungeon.length * dungeon[0].length) {
	                return -1; 
	            }
	        }

	        return steps;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[][] dungeon = {
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 1, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0}
	        };

	        System.out.println("Enter the AdventurerRow and AdventurerCol");
	        int AdventurerRow = in.nextInt(); // 5;
	        int AdventurerCol = in.nextInt(); // 1;

	        System.out.println("Enter the GoldRow and GoldCol");
	        int goldRow = in.nextInt(); // 4;
	        int goldCol = in.nextInt(); // 3;

	        System.out.println("Enter the MonsterRow and MonsterCol");
	        int monsterRow = in.nextInt(); // 3;
	        int monsterCol = in.nextInt(); // 1;

	        int steps = shortestPath(dungeon, AdventurerRow, AdventurerCol, goldRow, goldCol, monsterRow, monsterCol);

	        if (steps == -1) {
	            System.out.println("No possible solution");
	        } else {
	            System.out.println("Minimum number of steps: " + steps);
	        }
	    }
	}


