package enums;

public enum COLUMN {
	
	A(1),
	B(2),
	C(3),
	D(4),
	E(5),
	F(6);

	
	int column;

	COLUMN(int value) {
		// TODO Auto-generated constructor stub
		column=value;
	}
	
	public int value() {
		return column;
	}
}
