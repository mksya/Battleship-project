package entities;

import java.util.Set;

import enums.SHIPS;
import model.Position;
import model.Ship;
import model.Spot;

public class Battleship extends Ship{
	
	private SHIPS battleship = SHIPS.BATTLESHIP;
	private Position position;
	private boolean sunk = false;
	private int size = 4;
	private Set<Spot> spots;
	
}
