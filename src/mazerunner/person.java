package mazerunner;

public class person {
	
//constructors 
public person() {
	x = 0;
	y=0;
	mz = new Maze(10,10);
	memory = new int[mz.sizeOfMazeX()][mz.sizeOfMazeY()];
}
public person(Maze M) {
	x=0;
	y=0;
	mz = M;
	memory = new int[mz.sizeOfMazeX()][mz.sizeOfMazeY()];
}

public void decideWhereToGo() {
	
}
//actuators

//move in a direction valid direction to move will be checked elsewhere
public void move(char dir) {
	switch(dir) {
	case 'n':
		y++;
	break;
	case 's':
		y--;
	break;	
	
	case 'w':
		x++;
	break;
	case 'e':
	
	break;
	}
	lookAround();
	
}


//sensors
public void lookAround() {
	

	


	
}


//coordinates
private int x;
private int y;
//memory and maze
private Maze mz;
private int[][] memory;
}
