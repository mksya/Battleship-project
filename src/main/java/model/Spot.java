package model;

public class Spot {
	
	private int x;
	private int y;
	private boolean hit;
	private boolean available;

	

	public Spot(int x, int y, boolean hit, boolean available) {
		super();
		this.x = x;
		this.y = y;
		this.hit = hit;
		this.available = available;
	}

	public Spot() {
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

	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	


	
	
}
