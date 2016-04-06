package maze;

public class Maze {
	private int height;
	private int width;
	
	public Maze(int height, int widht) {
		this.height = height;
		this.width = widht;
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
}
