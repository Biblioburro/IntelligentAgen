package mazerunner;

public class testing {
public static void main(String[] args) {
	//intialize objects
	Maze m1 = new Maze(5,5);
	person p1 = new person(m1);
	//function testing
	m1.generateSolution();
	m1.randomizeMaze();
	//m1.printSolutions();
	m1.printMaze();
	System.out.println("This was added remotely potentially from a different computer");
}
}
