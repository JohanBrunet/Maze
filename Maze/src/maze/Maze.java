package maze;

import graph.GraphImp;

public class Maze extends GraphImp {
	private int height;
	private int width;
	private Cell[][] cells;
	private Cell departure;
	private Cell arrival;
	
	public Maze(int height, int width) {
		super(height*width, height*width*4, false);
		this.height = height;
		this.width = width;
		this.cells = new Cell[height][width];
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Cell getDeparture() {
		return departure;
	}

	public void setDeparture(Cell departure) {
		this.departure = departure;
	}

	public Cell getArrival() {
		return arrival;
	}

	public void setArrival(Cell arrival) {
		this.arrival = arrival;
	}
	
	public void initMaze(Cell departure, Cell arrival) {
		int i, j;
		for (i = 0; i < cells.length; i++) {
			for (j = 0; j < cells.length; j++) {
				if (departure.getX() == i && departure.getY() == j) {
					this.cells[i][j] = new Cell(i, j, CellType.D);
				}
				else if (arrival.getX() == i && arrival.getY() == j) {
					this.cells[i][j] = new Cell(i, j, CellType.A);
				}
				else {
					this.cells[i][j] = new Cell(i, j, CellType.W);
				}
			}
		}
	}
	
	public void setWalkableCells(Cell[] walkableCells) {
		int i;
		for (i = 0; i < walkableCells.length; i++) {
			this.cells[walkableCells[i].getX()][walkableCells[i].getY()] = walkableCells[i];
		}
	}
	
	public String toString() {
		int i, j;
		String maze = "";
		for (i = 0; i < cells.length; i++) {
			for (j = 0; j < cells.length; j++) {
				maze += this.cells[i][j].toString();
				maze += " ";
			}
			maze += "\n";
		}
		System.out.println(maze);
		return null;
	}
}
