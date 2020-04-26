import java.util.LinkedList;
// DAY 12
public class MazeSolverRefactor_D12 {

	static int[][] maze = {
			{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1},
			{1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}
	};
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		
		if (solveMaze(new Position(4,8)) ){
			System.out.println("You won.");
		}
		else {
			System.out.println("No PATH");
		}


	
	}
	private static boolean solveMaze(Position p) {
		path.push(p);
		
		while(true) {
			int r = path.peek().r;
			int c = path.peek().c;
			
			maze[r][c] = 0;
			
			// LEFT
			if (checkValid(r,c-1)) {
				if (maze[r][c-1] == 2){
					System.out.println("Moved Left.");
					return true; 
				} else if (maze[r][c-1] == 1) {
					System.out.println("Moved Left.");
					path.push(new Position(r,c-1));
					continue;
				}
			}
			// DOWN
			if (checkValid(r+1,c)) {
				if (maze[r+1][c] == 2){
					System.out.println("Moved Down.");
					return true;
				} else if (maze[r+1][c] == 1) {
					System.out.println("Moved Down.");
					path.push(new Position(r+1,c));
					continue;
				}
			}
			// RIGHT
			if (checkValid(r,c+1)) {
				if (maze[r][c+1] == 2){
					System.out.println("Moved Right.");
					return true;
				} else if (maze[r][c+1] == 1) {
					System.out.println("Moved Right.");
					path.push(new Position(r,c+1));
					continue;
				}
			}
			// UP
			if (checkValid(r-1,c)) {
				if (maze[r-1][c] == 2){
					System.out.println("Moved Up.");
					return true;
				} else if (maze[r-1][c] == 1) {
					System.out.println("Moved Up.");
					path.push(new Position(r-1,c));
					continue;
				}
			}
			
			path.pop();
			System.out.println("Moved Back.");
			if(path.size() <= 0) {
				//System.out.println("No PATH...");
				return false;
			}
		}
		
	}
	public static boolean checkValid(int rr, int cc) {
		if(rr < 0 || rr >= maze.length || cc < 0 || cc >= maze[rr].length) {
			return false;
		}
		return true;
	}

}
