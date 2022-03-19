package model;

import java.util.ArrayList;
import java.util.List;

import enums.AXIS;
import enums.DIRECTION;
import enums.SHIPS;

public class Ship {

	private SHIPS type;
	private boolean sunk;
	private int size;
	private Spot spot;
	private List<Spot> spots;

	
	public Ship(SHIPS type, boolean sunk, int size, Spot spot, List<Spot> spots) {
		super();
		this.type = type;
		this.sunk = sunk;
		this.size = size;
		this.spot = spot;
		this.spots = spots;
	}

	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void buildShip(SHIPS type, int size, String name) {
		Ship ship = new Ship();
		ship.setType(type);
		name =ship.type.name();
		ship.setSize(size);
		System.out.println(name);
		System.out.println(size);
	}

	public void deployShip(int size, int xO, int yO, AXIS axis, DIRECTION direction, List<Spot> position) {
		
		int i;
		if (axis==AXIS.HORIZONTAL && direction==DIRECTION.PLUS) {
			for (i = yO; i < (yO+size); i++) {
				Spot spot = new Spot();
				spot.setAvailable(false);
				System.out.println(xO +";" + i);
				position.add(spot);
				
			
			}
		}
		if (axis==AXIS.HORIZONTAL && direction==DIRECTION.MINUS) {
			for (i = yO; i >(yO-size); i--) {
				Spot spot = new Spot();
				spot.setAvailable(false);
				System.out.println(xO +";" + i);
				position.add(spot);
				
			}
		}
		if(axis==AXIS.VERTICAL && direction==DIRECTION.PLUS) {
			for(i=xO; i <(xO+size); i++) {
				Spot spot = new Spot();
				spot.setAvailable(false);
				System.out.println(i +";" + yO);
				position.add(spot);
			}
			}
		if(axis==AXIS.VERTICAL && direction==DIRECTION.MINUS) {
			for(i=xO; i >(xO-size); i--) {
				Spot spot = new Spot();
				spot.setAvailable(false);
				System.out.println(i +";" + yO);
				position.add(spot);
			}
			}

	}
	

	public SHIPS getType() {
		return type;
	}

	public void setType(SHIPS type) {
		this.type = type;
	}

	public boolean isSunk() {
		return sunk;
	}

	public void setSunk(boolean sunk) {
		this.sunk = sunk;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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

	
	

}
