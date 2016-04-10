package maze;

public class Game {

	public static void main(String[] args) {
		Cell departure = new Cell(2, 4, CellType.D);
		Cell arrival = new Cell(4,1, CellType.A);
		Cell[] walkableCells = new Cell[13];
		walkableCells[0] = new Cell(1, 1, CellType.E);
		walkableCells[1] = new Cell(1, 2, CellType.E);
		walkableCells[2] = new Cell(1, 3, CellType.E);
		walkableCells[3] = new Cell(1, 4, CellType.E);
		walkableCells[4] = new Cell(2, 1, CellType.E);
		walkableCells[5] = new Cell(3, 1, CellType.E);
		walkableCells[6] = new Cell(3, 4, CellType.E);
		walkableCells[7] = new Cell(4, 2, CellType.E);
		walkableCells[8] = new Cell(4, 3, CellType.E);
		walkableCells[9] = new Cell(4, 4, CellType.E);
		walkableCells[10] = new Cell(5, 1, CellType.E);
		walkableCells[11] = new Cell(5, 2, CellType.E);
		walkableCells[12] = new Cell(5, 3, CellType.E);
		Maze maze = new Maze(5, 5, departure, arrival);
		maze.setWalkableCells(walkableCells);
		maze.toString();
	}
}
