package business;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Battleship;
import entities.Carrier;
import entities.Cruiser;
import entities.Destroyer;
import entities.Submarine;
import enums.AXIS;
import enums.DIRECTION;
import enums.SHIPS;
import model.Fleet;
import model.Grid;
import model.Position;
import model.Ship;
import model.Spot;

public class GameImpl {

	public void generateField(Spot[][] field) {
		Grid grid = new Grid();
		int columns=10;
		int rows=10;
		field = new Spot [columns][rows];
	
		System.out.println("Field generated");
	}
	
	public void generateFleet(Fleet fleet) {
		ArrayList<Ship> ships = new ArrayList<Ship>();
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
		ships.add(carrier);
		ships.add(battleship1);
		ships.add(battleship2);
		ships.add(cruiser1);
		ships.add(cruiser2);
		ships.add(submarine1);
		ships.add(submarine2);
		ships.add(destroyer1);
		ships.add(destroyer2);
		ships.add(destroyer3);
		ships.add(destroyer4);
		
		fleet.setShips(ships);
	}
	
	public void deployFleet(Spot[][] field, Fleet fleet) {
		for(Ship ship : fleet.getShips()) {
			deployShip(field,ship);
		}
		
	}
	
	public void deployShip(Spot[][] field, Ship ship) {
		

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Position position = new Position();
		Set<Spot> spotsPosition = new HashSet<Spot>();
		
		System.out.println("Select axis");
		position.setAxis(AXIS.valueOf(scan.nextLine()));
		System.out.println("Select direction");
		position.setDirection(DIRECTION.valueOf(scan.nextLine()));
		System.out.println("Select origin x,y");
		position.setxO(scan.nextInt());
		position.setyO(scan.nextInt());	
		
		
		int i;
		if (position.getAxis()==AXIS.HORIZONTAL && position.getDirection()==DIRECTION.PLUS) {
			for(i=position.getyO();i<position.getyO()-ship.getSize();i++) {
					field[position.getxO()][i]= new Spot(position.getxO(),i,false,true);
			}
			
		}
		
		if (position.getAxis()==AXIS.HORIZONTAL && position.getDirection()==DIRECTION.MINUS) {
			for(i=position.getyO();i>position.getyO()-ship.getSize();i--) {
					field[position.getxO()][i]= new Spot(position.getxO(),i,false,true);
			}
		}	
				
			
		if(position.getAxis()==AXIS.VERTICAL && position.getDirection()==DIRECTION.PLUS) {
			for(i=position.getxO(); i <position.getxO()+ship.getSize(); i++) {
				field[i][position.getyO()]=new Spot(i,position.getyO(),false,true);
			
			}
		}
		if(position.getAxis()==AXIS.VERTICAL && position.getDirection()==DIRECTION.MINUS) {
			for(i=position.getxO(); i <position.getxO()+ship.getSize(); i++) {
				field[i][position.getyO()]=new Spot(i,position.getyO(),false,true);
			
			}
		}
		
		ship.setPosition(position);

	}
	
	public void generateStrike(Spot[][]field) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Spot spot = new Spot();
		System.out.println("Select origin x,y");
		spot.setX(scan.nextInt());
		spot.setY(scan.nextInt());	
		field[spot.getX()][spot.getY()] = new Spot(spot.getX(),spot.getY(),false,true);
		
		
	}
	
}
