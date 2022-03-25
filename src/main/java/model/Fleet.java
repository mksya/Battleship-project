package model;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
	
	ArrayList<Ship>ships;

	
	public Fleet(ArrayList<Ship> ships) {
		super();
		this.ships = ships;
	}

	public Fleet() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ArrayList<Ship> getShips() {
		return ships;
	}

	public void setShips(ArrayList<Ship> ships) {
		this.ships = ships;
	}



}
