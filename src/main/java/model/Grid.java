package model;

import java.util.ArrayList;
import java.util.List;

public class Grid {

	private int[][] field;
	private int columns;
	private int rows;
	private Spot spot;
	private List<Spot> spots;
	private Ship ship;
	

	public Grid(int[][] field, int columns, int rows, Spot spot, List<Spot> spots, Ship ship) {
		super();
		this.field = field;
		this.columns = columns;
		this.rows = rows;
		this.spot = spot;
		this.spots = spots;
		this.ship = ship;
	}

	public Grid() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void generateGrid(int columns, int rows, int[][] axis, List<Spot> spots) {
		spots=new ArrayList<Spot>();
		axis = new int[columns][rows];
		for(int i=0;i<axis.length;i++) {
			for(int j=0;j<axis[i].length;j++){
				Spot spot = new Spot();
				spot.setX(i);
				spot.setY(j);
				int[][] coordinates = new int[i][j];
				spot.setCoordinates(coordinates);
				spots.add(spot);
			}
			
		}
	}

	public int[][] getField() {
		return field;
	}

	public void setField(int[][] field) {
		this.field = field;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public Spot getSpot() {
		return spot;
	}

	public void setSpot(Spot spot) {
		this.spot = spot;
	}

	public List<Spot> getSpots() {
		return spots;
	}

	public void setSpots(List<Spot> spots) {
		this.spots = spots;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	
	
}
