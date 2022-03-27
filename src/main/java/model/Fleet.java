package model;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
	
	private ArrayList<Ship>ships;
	private Position position;

	

	public Fleet(ArrayList<Ship> ships, Position position) {
		super();
		this.ships = ships;
		this.position = position;
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


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}
	



}
