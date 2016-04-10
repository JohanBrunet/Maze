package maze;

import graph.Edge;
import graph.Vertex;

public class Game {
	private static Cell[] walkableCells;
	
	public static void main(String[] args) {
		Cell departure = new Cell(0, 0, CellType.D, false);
		Cell arrival = new Cell(2, 2, CellType.A, false);
		Maze maze = new Maze(3, 3);
		maze.initMaze(departure, arrival);
		maze.setWalkableCells(createWalkableCells());
		maze.toString();
		System.out.println("Departure : " + departure.displayCoord());
		System.out.println("Arrival : " + arrival.displayCoord());
		Vertex[] neighbors = maze.getNeighboors(arrival);
	}
	
	public static Cell[] createWalkableCells() {
		walkableCells = new Cell[6];
		walkableCells[0] = new Cell(0, 1, CellType.E, false);
		walkableCells[1] = new Cell(0, 2, CellType.E, false);
		walkableCells[2] = new Cell(1, 0, CellType.E, false);
		walkableCells[3] = new Cell(1, 2, CellType.E, false);
		walkableCells[4] = new Cell(2, 0, CellType.E, false);
		walkableCells[5] = new Cell(2, 1, CellType.E, false);
		return walkableCells;
	}
	
	public static Edge[] setEdges() {
		//TODO implement method to set the edges between walkable cells
		int i;
		for (i = 0; i < walkableCells.length; i++) {
			
		}
		return null;
	}
}
