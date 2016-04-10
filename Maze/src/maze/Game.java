package maze;

public class Game {

	public static void main(String[] args) {
		Cell departure = new Cell(0, 0, CellType.D);
		Cell arrival = new Cell(2, 2, CellType.A);
		Maze maze = new Maze(3, 3, departure, arrival);
		Cell[] walkableCells = new Cell[6];
		walkableCells[0] = new Cell(0, 1, CellType.E);
		walkableCells[1] = new Cell(0, 2, CellType.E);
		walkableCells[2] = new Cell(1, 0, CellType.E);
		walkableCells[3] = new Cell(1, 2, CellType.E);
		walkableCells[4] = new Cell(2, 0, CellType.E);
		walkableCells[5] = new Cell(2, 1, CellType.E);
		maze.setWalkableCells(walkableCells);
		maze.toString();
	}
}
