package model;

public class Strike {
	
	private int x;
	private int y;
	private int size = 3;
	private Position position;
	
	


	public Strike(int x, int y, int size, Position position) {
		super();
		this.x = x;
		this.y = y;
		this.size = size;
		this.position = position;
	}

	public Strike() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	
	
}
