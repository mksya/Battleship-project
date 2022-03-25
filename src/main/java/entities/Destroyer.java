package entities;

import java.util.Set;

import enums.SHIPS;
import model.Position;
import model.Ship;
import model.Spot;

public class Destroyer extends Ship{
	
	private SHIPS destroyer = SHIPS.DESTROYER;
	private Position position;
	private boolean sunk = false;
	private int size = 2;
	private Set<Spot> spots;
	

}
