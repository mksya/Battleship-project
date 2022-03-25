package model;


public class Grid {

	private int[][] field;
	private int columns;
	private int rows;
	private Spot spot;
	
	public Grid(int[][] field, int columns, int rows, Spot spot) {
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

	
}
