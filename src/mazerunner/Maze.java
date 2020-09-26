package mazerunner;

public class Maze {
	//constructors
	public Maze() {
		maze = new int[10][10];
		solution = new int[10][10];
		this.generateSolution();
		this.randomizeMaze();
	}
	public Maze(int x, int y) {
	maze = new int[x][y];
	solution = new int[x][y];
	this.generateSolution();
	this.randomizeMaze();
	
	}
	//generate a solution and then a maze
	public void randomizeMaze() {
	for(int x =0;x<maze.length;x++) {
		for(int y =0 ; y<maze[0].length;y++) {
			if(solution[x][y] == 1) {
				continue;
			}
			if(Math.random()>.5) {
				maze[x][y] = 1;
			}else {
				maze[x][y] =0;
			}
		}
	}
	}
	//helper function to generate random solution to the maze
	public void generateSolution() {
		
		
		solution[entrance[0]][entrance[1]] =1;
		//store the amount of times left to go down or right
		
		//do the number of moves required to make it to the exit
		
		//while we are not at the exit
		for(int x =0;x<solution.length;x++) {
			solution[x][0] =1;
		}
		for(int y =0;y<solution[0].length;y++) {
			solution[solution.length-1][y] =1;
		}
		
	}
	//provides the ability for to check whether maze is present or not
	public boolean isThereMaze(int x, int y) {
		if(maze[x][y] == 1) {
			return true;
		}else {
			return false;
		}
	}
	public int sizeOfMazeX() {
		return maze.length;
	}
	public int sizeOfMazeY() {
		return maze[0].length;
	}
	
	
	//functions to display the maze and solution to screen
	public void printMaze () {
		for(int x =0 ; x<maze.length;x++) {
			for(int y =0 ;y<maze[x].length;y++) {
				System.out.print(maze[x][y]);
			}
			System.out.println();
		}
	}
	public void printSolutions() {
		for(int x =0 ; x<solution.length;x++) {
			for(int y =0 ;y<solution[x].length;y++) {
				System.out.print(solution[x][y]);
			}
			System.out.println();
		}
		
	}
	//declaring variables
	private int[][] solution;
	private int[][] maze;
	private int[] entrance = {0,0};
	private int[] exit = {0,0};
	
}
