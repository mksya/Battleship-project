package enums;

public enum ROW {

	ONE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9);
	
	int row;
	
	ROW(int value) {
		// TODO Auto-generated constructor stub
		row=value;
	}
	
	public int value() {
		return row;
	}
}
