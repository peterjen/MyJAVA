

public class MazeSolverClass {

	public static Maze m = new Maze();

	public static void main(String[] args) {
		int[][] maze = {
				{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
				{0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
				{0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1},
				{1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0},
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
				{0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}
		};
		m.maze = maze;
		m.start = new Position(4,8);
		
		
		if (solveMaze(m.start) ){
			System.out.println("You won.");
		}
		else {
			System.out.println("No PATH");
		}


	
	}
	private static boolean solveMaze(Position p) {
		m.path.push(p);
		
		while(true) {
			int r = m.path.peek().r;
			int c = m.path.peek().c;
			
			m.maze[r][c] = 0;
			
			// LEFT
			if (checkValid(r,c-1)) {
				if (m.maze[r][c-1] == 2){
					System.out.println("Moved Left.");
					return true; 
				} else if (m.maze[r][c-1] == 1) {
					System.out.println("Moved Left.");
					m.path.push(new Position(r,c-1));
					continue;
				}
			}
			// DOWN
			if (checkValid(r+1,c)) {
				if (m.maze[r+1][c] == 2){
					System.out.println("Moved Down.");
					return true;
				} else if (m.maze[r+1][c] == 1) {
					System.out.println("Moved Down.");
					m.path.push(new Position(r+1,c));
					continue;
				}
			}
			// RIGHT
			if (checkValid(r,c+1)) {
				if (m.maze[r][c+1] == 2){
					System.out.println("Moved Right.");
					return true;
				} else if (m.maze[r][c+1] == 1) {
					System.out.println("Moved Right.");
					m.path.push(new Position(r,c+1));
					continue;
				}
			}
			// UP
			if (checkValid(r-1,c)) {
				if (m.maze[r-1][c] == 2){
					System.out.println("Moved Up.");
					return true;
				} else if (m.maze[r-1][c] == 1) {
					System.out.println("Moved Up.");
					m.path.push(new Position(r-1,c));
					continue;
				}
			}
			
			m.path.pop();
			System.out.println("Moved Back.");
			if(m.path.size() <= 0) {
				//System.out.println("No PATH...");
				return false;
			}
		}
		
	}
	public static boolean checkValid(int rr, int cc) {
		if(rr < 0 || rr >= m.maze.length || cc < 0 || cc >= m.maze[rr].length) {
			return false;
		}
		return true;
	}

}
