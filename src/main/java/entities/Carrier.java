package entities;

import java.util.Set;

import enums.SHIPS;
import model.Position;
import model.Ship;
import model.Spot;

public class Carrier extends Ship{
	
	private SHIPS carrier = SHIPS.CARRIER;
	private Position position;
	private boolean sunk = false;
	private int size = 5;
	private Set<Spot> spots;
	

}
