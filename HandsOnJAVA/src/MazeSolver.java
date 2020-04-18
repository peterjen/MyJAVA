import java.util.LinkedList;

public class MazeSolver {

	static int[][] maze = {
			{2,0,1,1},  // 0: Wall
			{1,1,0,1},  // 1: Path
			{0,1,1,1}   // 2: Goal
	};
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		Position p = new Position(0,3);
		path.push(p);
		maze[path.peek().c][path.peek().r] = 0;
		System.out.println("END");
		
	}

}
