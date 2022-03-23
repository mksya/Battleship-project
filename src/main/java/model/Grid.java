package model;

import java.util.ArrayList;
import java.util.List;

public class Grid {

	private int[][] field;
	private int columns;
	private int rows;
	private Spot spot;
	private ArrayList<Spot> spots;
	private Ship ship;
	

	public Grid(int[][] field, int columns, int rows, Spot spot, ArrayList<Spot> spots, Ship ship) {
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
	
	public void generateGrid(Grid grid, int columns, int rows, int[][] field, ArrayList<Spot> spots) {
		spots=new ArrayList<Spot>();
		field = new int[columns][rows];
		for(int i=0;i<field.length;i++) {
			for(int j=0;j<field[i].length;j++){
				Spot spot = new Spot();
				spot.setX(i);
				spot.setY(j);
				int[][] coordinates = new int[i][j];
				spot.setCoordinates(coordinates);
				spot.setAvailable(true);
				spots.add(spot);
				grid.setSpots(spots);
			}
			
		}
		
		System.out.println("Grid generated");
	}
	
	public void blockPositionOnGrid(Grid grid, Position position) {
		int i;
		for(i=0;i<position.getSpots().size();i++) {
			if(grid.getSpots().get(i).getCoordinates().equals(position.getSpots().get(i).getCoordinates())) {
				grid.getSpot().setAvailable(false);
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

	public ArrayList<Spot> getSpots() {
		return spots;
	}

	public void setSpots(ArrayList<Spot> spots) {
		this.spots = spots;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	
	
}
