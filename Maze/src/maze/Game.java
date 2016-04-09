package maze;

public class Game {

	public static void main(String[] args) {
		Cell departure = new Cell(1, 2, CellType.D);
		Cell arrival = new Cell(3,3, CellType.A);
		Maze maze = new Maze(3, 3, departure, arrival);
		maze.toString();
	}

}
