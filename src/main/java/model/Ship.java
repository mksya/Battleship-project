package model;


import java.util.Set;

import enums.SHIPS;

public class Ship {

	private SHIPS type;
	private Position position;
	private boolean sunk;
	private int size;

	

	public Ship(SHIPS type, Position position, boolean sunk, int size) {
		super();
		this.type = type;
		this.position = position;
		this.sunk = sunk;
		this.size = size;
	}


	public Ship() {
		super();
		// TODO Auto-generated constructor stub
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



}
