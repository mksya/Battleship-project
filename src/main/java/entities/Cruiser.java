package entities;

import java.util.Set;

import enums.SHIPS;
import model.Position;
import model.Ship;
import model.Spot;

public class Cruiser extends Ship{
	
	private SHIPS cruiser = SHIPS.CRUISER;
	private Position position;
	private boolean sunk = false;
	private int size = 3;
	private Set<Spot> spots;
	

}
