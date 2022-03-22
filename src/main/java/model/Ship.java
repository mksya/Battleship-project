package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enums.AXIS;
import enums.DIRECTION;
import enums.SHIPS;

public class Ship {

	private SHIPS type;
	private Position position;
	private boolean sunk;
	private int size;
	private Spot spot;
	

	public Ship(SHIPS type, Position position, boolean sunk, int size, Spot spot) {
		super();
		this.type = type;
		this.position = position;
		this.sunk = sunk;
		this.size = size;
		this.spot = spot;
	}

	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void buildShip(Grid grid, Ship ship, SHIPS type, int size, String name, Position position) {
		
		ship.setType(type);
		name =ship.type.name();
		ship.setSize(size);
		
		System.out.println(name);
		System.out.println(size);
		
		ship.deployShip();
		ship.setPosition(position);
		System.out.println("Ship on position");
			
		
	}
	

	public void deployShip() {
		

		Scanner scan = new Scanner(System.in);
		
		Position position = new Position();
		System.out.println("Select axis");
		position.setAxis(AXIS.valueOf(scan.nextLine()));
		System.out.println("Select direction");
		position.setDirection(DIRECTION.valueOf(scan.nextLine()));
		System.out.println("Select origin x,y");
		position.setxO(scan.nextInt());
		position.setyO(scan.nextInt());	
		
		ArrayList<Spot> spots = new ArrayList<Spot>();
		position.setSpots(spots);
		
		int i;
		if (position.getAxis()==AXIS.HORIZONTAL && position.getDirection()==DIRECTION.PLUS) {
			for (i = position.getyO(); i < (position.getyO()+size); i++) {
				Spot spot = new Spot();
				spot.setAvailable(false);
				System.out.println(position.getxO() +";" + i);
				position.getSpots().add(spot);
			
			}
		}
		if (position.getAxis()==AXIS.HORIZONTAL && position.getDirection()==DIRECTION.MINUS) {
			for (i = position.getyO(); i >(position.getyO()-size); i--) {
				Spot spot = new Spot();
				spot.setAvailable(false);
				System.out.println(position.getxO() +";" + i);
				position.getSpots().add(spot);
				
			}
		}
		if(position.getAxis()==AXIS.VERTICAL && position.getDirection()==DIRECTION.PLUS) {
			for(i=position.getxO(); i <(position.getxO()+size); i++) {
				Spot spot = new Spot();
				spot.setAvailable(false);
				System.out.println(i +";" + position.getyO());
				position.getSpots().add(spot);
			}
			}
		if(position.getAxis()==AXIS.VERTICAL && position.getDirection()==DIRECTION.MINUS) {
			for(i=position.getxO(); i >(position.getxO()-size); i--) {
				Spot spot = new Spot();
				spot.setAvailable(false);
				System.out.println(i +";" + position.getyO());
				position.getSpots().add(spot);
			}
			}

	}

	public SHIPS getType() {
		return type;
	}

	public void setType(SHIPS type) {
		this.type = type;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
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

	


}
