import java.util.LinkedList;

public class MazeSolver_D9 {

	static int[][] maze = {
			{2,0,1,1},  // 0: Wall
			{1,1,1,1},  // 1: Path
			{0,1,1,1}   // 2: Goal
	};
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		Position p = new Position(0,3);
		path.push(p);
		
		while(true) {
			int r = path.peek().r;
			int c = path.peek().c;
			
			maze[r][c] = 0;
			
			// LEFT
			if (checkValid(r,c-1)) {
				if (maze[r][c-1] == 2){
					System.out.println("Moved Left, You won.");
					return;
				} else if (maze[r][c-1] == 1) {
					System.out.println("Moved Left.");
					path.push(new Position(r,c-1));
					continue;
				}
			}
			// DOWN
			if (checkValid(r+1,c)) {
				if (maze[r+1][c] == 2){
					System.out.println("Moved Down, You won.");
					return;
				} else if (maze[r+1][c] == 1) {
					System.out.println("Moved Down.");
					path.push(new Position(r+1,c));
					continue;
				}
			}
			// RIGHT
			if (checkValid(r,c+1)) {
				if (maze[r][c+1] == 2){
					System.out.println("Moved Right, You won.");
					return;
				} else if (maze[r][c+1] == 1) {
					System.out.println("Moved Right.");
					path.push(new Position(r,c+1));
					continue;
				}
			}
			// UP
			if (checkValid(r-1,c)) {
				if (maze[r-1][c] == 2){
					System.out.println("Moved Up, You won.");
					return;
				} else if (maze[r-1][c] == 1) {
					System.out.println("Moved Up.");
					path.push(new Position(r-1,c));
					continue;
				}
			}
			
			path.pop();
			System.out.println("Moved Back.");
			if(path.size() <= 0) {
				System.out.println("No PATH...");
				return;
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
