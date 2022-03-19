package enums;

public enum SHIPS {

	CARRIER(5),
	BATTLESHIP(4),
	CRUISER(3),
	SUBMARINE(3),
	DESTROYER(2);
	
	int size;
	SHIPS(int value) {
		// TODO Auto-generated constructor stub
		size=value;
	}
	
	public int value() {
		return size;
	}
}
