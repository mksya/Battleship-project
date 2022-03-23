package model;

import java.util.ArrayList;

import enums.AXIS;
import enums.DIRECTION;

public class Position {

	private AXIS axis;
	private DIRECTION direction;
	private int xO;
	private int yO;
	private ArrayList<Spot> spots;
	private Spot spot;
	

	public Position(AXIS axis, DIRECTION direction, int xO, int yO, ArrayList<Spot> spots, Spot spot) {
		super();
		this.axis = axis;
		this.direction = direction;
		this.xO = xO;
		this.yO = yO;
		this.spots = spots;
		this.spot = spot;
	}


	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AXIS getAxis() {
		return axis;
	}


	public void setAxis(AXIS axis) {
		this.axis = axis;
	}


	public DIRECTION getDirection() {
		return direction;
	}


	public void setDirection(DIRECTION direction) {
		this.direction = direction;
	}


	public int getxO() {
		return xO;
	}


	public void setxO(int xO) {
		this.xO = xO;
	}


	public int getyO() {
		return yO;
	}


	public void setyO(int yO) {
		this.yO = yO;
	}


	public ArrayList<Spot> getSpots() {
		return spots;
	}


	public void setSpots(ArrayList<Spot> spots) {
		this.spots = spots;
	}


	public Spot getSpot() {
		return spot;
	}


	public void setSpot(Spot spot) {
		this.spot = spot;
	}




	
	
}
