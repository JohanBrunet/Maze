package maze;

public class Game {

	public static void main(String[] args) {
		Cell departure = new Cell(1, 2, CellType.D);
		Cell arrival = new Cell(3,3, CellType.A);
		Cell[] walkableCells = new Cell[2];
		walkableCells[0] = new Cell(2,2, CellType.E);
		walkableCells[1] = new Cell(3,2, CellType.E);
		Maze maze = new Maze(3, 3, departure, arrival);
		maze.toString();
		maze.setWalkableCells(walkableCells);
		maze.toString();
	}
}