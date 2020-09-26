package mazerunner;

public class person {
public person() {
	x = 0;
	y=0;
	mz = new Maze(10,10);
}
public person(Maze M) {
	x=0;
	y=0;
	mz = M;
}

//coordinates
private int x;
private int y;
private Maze mz;
private int[][] memory;
}
