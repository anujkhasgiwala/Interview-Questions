package intuit;

public class GameOfLife {
	int[][] world = new int[4][3];
	
	void gameOfLife() {
		if(world == null || world.length == 0 || world[0].length == 0)
			return;

		int neighbors[] = {0, 1, -1};
		
		int rows = world.length, columns = world[0].length;
		for(int row = 0; row < rows; row++) {
			for(int column = 0; column < columns; column++) {
				int liveNeighbors = 0;
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(neighbors[i] != 0 && neighbors[j] != 0) {
							int r = row + neighbors[i];
							int c = column + neighbors[j];
							
							if ((r < rows && r >= 0) && (c < columns && c >= 0) && (Math.abs(world[r][c]) == 1)) {
                                liveNeighbors++;
                            }
						}
					}
				}
				
				// Rule 1 or Rule 3
                if ((world[row][column] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    // -1 signifies the cell is now dead but originally was live.
                    world[row][column] = -1;
                }
                // Rule 4
                if (world[row][column] == 0 && liveNeighbors == 3) {
                    // 2 signifies the cell is now live but was originally dead.
                    world[row][column] = 2;
                }
			}
		}
		
		for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (world[row][col] > 0) {
                    world[row][col] = 1;
                } else {
                    world[row][col] = 0;
                }
            }
        }
	}
}
