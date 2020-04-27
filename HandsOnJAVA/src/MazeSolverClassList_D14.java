import java.util.ArrayList;
import java.util.LinkedList;


public class MazeSolverClassList_D14 {
	
	public static void main(String[] args) {
		ArrayList<Maze> mazes = new ArrayList<Maze>();
		
		Maze m = new Maze();
		int[][] maze_m = {
				{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
				{0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
				{0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1},
				{1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0},
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
				{0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}
		};
		//showArray(maze_m);
		m.maze = maze_m;
		m.start = new Position(4,8);
		m.path = new LinkedList<Position>();
		
		Maze n = new Maze();
		int[][] maze_n = {
				{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
				{0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
				{0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1},
				{1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0},
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
				{0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}
		};
		//System.out.println("----------------");
		//showArray(maze_m);
		n.maze = maze_n;
		n.start = new Position(4,8);
		n.path = new LinkedList<Position>();
		
		mazes.add(m);
		mazes.add(n);
		
		int i = 0;
		while( i < mazes.size()) {
			if (solveMaze(mazes.get(i)) ){
				System.out.println("You won.");
			}
			else {
				System.out.println("No PATH");
			}
			i++;
		}
		
	}
	private static boolean solveMaze(Maze m) {
		System.out.println("###");
		showArray(m.maze);
		
		m.path.push(m.start);
		
		while(true) {
			int r = m.path.peek().r;
			int c = m.path.peek().c;
			
			m.maze[r][c] = 0;
			
			// LEFT
			if (checkValid(r,c-1,m)) {
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
			if (checkValid(r+1,c,m)) {
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
			if (checkValid(r,c+1,m)) {
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
			if (checkValid(r-1,c,m)) {
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
	public static boolean checkValid(int rr, int cc,Maze m) {
		if(rr < 0 || rr >= m.maze.length || cc < 0 || cc >= m.maze[rr].length) {
			return false;
		}
		return true;
	}
	
	public static void showArray(int[][] aa) {
		for(int i = 0 ; i < aa.length; i++) {
			for(int j = 0; j < aa[i].length;j++) {
				System.out.print(aa[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
