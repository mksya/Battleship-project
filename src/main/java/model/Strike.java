package model;

public class Strike {
	
	private int x;
	private int y;
	private Spot spot;
	
	public Strike(int x, int y, Spot spot) {
		super();
		this.x = x;
		this.y = y;
		this.spot = spot;
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

	public Spot getSpot() {
		return spot;
	}

	public void setSpot(Spot spot) {
		this.spot = spot;
	}

	
	
	
}
