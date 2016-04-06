package maze;

import graph.GraphImp;

public class Maze extends GraphImp {
	private int height;
	private int width;
	private Cell[][] cells;
	private Cell departure;
	private Cell arrival;
	
	public Maze(int height, int width, Cell departure, Cell arrival) {
		super(height*width, height*width*4, false);
		this.height = height;
		this.width = width;
		this.departure = departure;
		this.arrival = arrival;
		this.cells = new Cell[height][width];
		initMaze(departure, arrival);
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
	
	private void initMaze(Cell departure, Cell arrival) {
		int i;
		int j;
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
	
	public String toString() {
		//TODO implement method
		return null;
	}
}
