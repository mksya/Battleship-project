package entities;

import java.util.Set;

import enums.SHIPS;
import model.Position;
import model.Ship;
import model.Spot;

public class Submarine extends Ship{
	
	private SHIPS submarine = SHIPS.SUBMARINE;
	private Position position;
	private boolean sunk = false;
	private int size = 3;
	private Set<Spot> spots;
	

}
