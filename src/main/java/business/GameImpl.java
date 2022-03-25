package business;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Battleship;
import entities.Carrier;
import entities.Cruiser;
import entities.Destroyer;
import entities.Submarine;
import enums.AXIS;
import enums.DIRECTION;
import enums.SHIPS;
import model.Grid;
import model.Position;
import model.Ship;
import model.Spot;

public class GameImpl {

	public void generateField() {
		Grid grid = new Grid();
		int columns=10;
		int rows=10;
		int[][] field = new int [columns][rows];
		System.out.println("Field generated");
	}
	
	public void generateShip() {
		Carrier carrier = new Carrier();
		Battleship battleship1 = new Battleship();
		Battleship battleship2 = new Battleship();
		Cruiser cruiser1 = new Cruiser();
		Cruiser cruiser2 = new Cruiser();
		Submarine submarine1 = new Submarine();
		Submarine submarine2 = new Submarine();
		Destroyer destroyer1 = new Destroyer();
		Destroyer destroyer2 = new Destroyer();
		Destroyer destroyer3 = new Destroyer();
		Destroyer destroyer4 = new Destroyer();
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
	
}
