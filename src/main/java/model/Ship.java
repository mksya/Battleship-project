package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import enums.AXIS;
import enums.DIRECTION;
import enums.SHIPS;

public class Ship {

	private SHIPS type;
	private Position position;
	private boolean sunk;
	private int size;
	private Set<Spot> spots;
	

	public Ship(SHIPS type, Position position, boolean sunk, int size, Set<Spot> spots) {
		super();
		this.type = type;
		this.position = position;
		this.sunk = sunk;
		this.size = size;
		this.spots = spots;
	}


	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void deployShip(Grid grid, Ship ship) {
		

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Position position = new Position();
		ArrayList<Spot> spotsPosition = new ArrayList<Spot>();
		
		System.out.println("Select axis");
		position.setAxis(AXIS.valueOf(scan.nextLine()));
		System.out.println("Select direction");
		position.setDirection(DIRECTION.valueOf(scan.nextLine()));
		System.out.println("Select origin x,y");
		position.setxO(scan.nextInt());
		position.setyO(scan.nextInt());	
		
		int i;
		if (position.getAxis()==AXIS.HORIZONTAL && position.getDirection()==DIRECTION.PLUS) {
			for (i = position.getyO(); i < (position.getyO()+size); i++) {
				Spot spot = new Spot();
				int[][] coordinates = new int[position.getxO()][i];
				System.out.println(position.getxO() +";" + i);
				spot.setCoordinates(coordinates);
				spot.setX(position.getxO());
				spot.setY(i);
				spotsPosition.add(spot);
				position.setSpot(spot);
			
		
			}
		}
		
		if (position.getAxis()==AXIS.HORIZONTAL && position.getDirection()==DIRECTION.MINUS) {
			for (i = position.getyO(); i >(position.getyO()-size); i--) {
				Spot spot = new Spot();
				int[][] coordinates = new int[position.getxO()][i];
				System.out.println(position.getxO() +";" + i);
				spot.setCoordinates(coordinates);
				spot.setX(position.getxO());
				spot.setY(i);
				spotsPosition.add(spot);
				position.setSpot(spot);
				grid.setSpot(spot);
			
				
			}
		}
		if(position.getAxis()==AXIS.VERTICAL && position.getDirection()==DIRECTION.PLUS) {
			for(i=position.getxO(); i <(position.getxO()+size); i++) {
				Spot spot = new Spot();
				int[][] coordinates = new int[i][position.getyO()];
				System.out.println(i +";" + position.getyO());
				spot.setCoordinates(coordinates);
				spot.setX(position.getxO());
				spot.setY(i);
				spotsPosition.add(spot);
				position.setSpot(spot);
				grid.setSpot(spot);
			
			}
			}
		if(position.getAxis()==AXIS.VERTICAL && position.getDirection()==DIRECTION.MINUS) {
			for(i=position.getxO(); i >(position.getxO()-size); i--) {
				Spot spot = new Spot();
				int[][] coordinates = new int[i][position.getyO()];
				System.out.println(i +";" + position.getyO());
				spot.setCoordinates(coordinates);
				spot.setX(position.getxO());
				spot.setY(i);
				spotsPosition.add(spot);
				position.setSpot(spot);
				grid.setSpot(spot);
		
			}
			}
		
		position.setSpots(spotsPosition);

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


	public Set<Spot> getSpots() {
		return spots;
	}


	public void setSpots(Set<Spot> spots) {
		this.spots = spots;
	}
	




}
