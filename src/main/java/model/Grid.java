package model;


public class Grid {

	private Spot[][] field;
	private int columns;
	private int rows;
	private Spot spot;
	
	

	public Grid(Spot[][] field, int columns, int rows, Spot spot) {
		super();
		this.field = field;
		this.columns = columns;
		this.rows = rows;
		this.spot = spot;
	}


	public Grid() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Spot[][] getField() {
		return field;
	}


	public void setField(Spot[][] field) {
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
	


	
}
