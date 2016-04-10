package maze;

import graph.Vertex;

public class Cell extends Vertex {
	private CellType type;
	private int x;
	private int y;
	
	public Cell(int x, int y, CellType type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public CellType getType() {
		return type;
	}

	public void setType(CellType type) {
		this.type = type;
	}
	
	public String displayCoord() {
		String coord = "(" + this.x + "," + this.y + ")";
		return coord;
	}
	
	public String toString() {
		switch(this.type) {
		case A : return "A";
		case D : return "D";
		case E : return ".";
		case W : return "|";
		default : return "|";
		}
	}
}
