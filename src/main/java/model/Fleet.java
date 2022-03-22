package model;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
	
	Ship ship;
	ArrayList<Ship>ships;

	
	public Fleet(Ship ship, ArrayList<Ship> ships) {
		super();
		this.ship = ship;
		this.ships = ships;
	}

	public Fleet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void generateFleet(ArrayList<Ship> ships, Ship carrier, Ship battleshipA, Ship battleshipB, Ship cruiserA, Ship cruiserB, Ship submarineA, Ship submarineB, Ship destroyerA, Ship destroyerB, Ship destroyerC, Ship destroyerD) {
		
		Fleet fleet = new Fleet();
		
		ships.add(carrier);
		ships.add(battleshipA);
		ships.add(battleshipB);
		ships.add(cruiserA);
		ships.add(cruiserB);
		ships.add(submarineA);
		ships.add(submarineB);
		ships.add(destroyerA);
		ships.add(destroyerB);
		ships.add(destroyerC);
		ships.add(destroyerD);
		
		fleet.setShips(ships);
	}


	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public List<Ship> getShips() {
		return ships;
	}

	public void setShips(ArrayList<Ship> ships) {
		this.ships = ships;
	}

	
	

}
