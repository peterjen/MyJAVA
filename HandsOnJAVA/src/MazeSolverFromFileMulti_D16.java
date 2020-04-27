import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MazeSolverFromFileMulti_D16 {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Maze> mazes = new ArrayList<Maze>();
		mazes = readMazesFromFile();
		
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
	private static ArrayList<Maze> readMazesFromFile() throws FileNotFoundException {
		ArrayList<Maze> mazes = new ArrayList<Maze>();
		

		Scanner in = new Scanner(new File("src/MazesMulti.txt"));
		while(in.hasNext()) {
			Maze m = new Maze();
			int arow = Integer.parseInt(in.nextLine());
	
			m.maze = new int[arow][];
			
			for(int i=0; i < arow;i++) {
				String ss = in.nextLine();
				//System.out.println(Arrays.stream(ss.split(", ")).mapToInt(Integer::parseInt).toArray());
				m.maze[i] = Arrays.stream(ss.split(", ")).mapToInt(Integer::parseInt).toArray();
				
			}
			//showArray(m.maze);
			//m.path = new LinkedList<Position>();
			m.start = new Position(Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
			//System.out.println(m.start.r + " " + m.start.c);
			String nnn = in.nextLine();
			System.out.println(nnn);
			mazes.add(m);
		}
		in.close();
		return mazes;
		
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
