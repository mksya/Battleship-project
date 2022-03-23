package mksya.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.Spot;
import enums.AXIS;
import enums.DIRECTION;
import enums.SHIPS;
import model.Fleet;
import model.Grid;
import model.Position;
import model.Ship;

@SpringBootApplication
public class BattleshipProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BattleshipProjectApplication.class, args);
		
		//Generate grid
				Grid grid = new Grid();
				int columns=10;
				int rows=10;
				int field[][]= new int[columns][rows];
				ArrayList<Spot> spots = new ArrayList<Spot>();
				grid.generateGrid(grid,columns,rows,field,spots);	
				
				
		//Generate ships
				Scanner scan = new Scanner(System.in);
				
				Ship carrier = new Ship();
				String nameCar = null;
				int sizeCar=5;
				Position positionCar = new Position();
				carrier.buildShip(grid, carrier, SHIPS.CARRIER, sizeCar, nameCar, positionCar);
				
				Ship battleshipA = new Ship();
				String nameBatA = null;
				int sizeBat=4;
				Position positionBatA = new Position();
				battleshipA.buildShip(grid, battleshipA, SHIPS.BATTLESHIP, sizeBat, nameBatA, positionBatA);
				
				Ship battleshipB = new Ship();
				String nameBatB = null;
				Position positionBatB = new Position();
				battleshipB.buildShip(grid, battleshipB, SHIPS.BATTLESHIP, sizeBat, nameBatB, positionBatB);
				
				Ship cruiserA= new Ship();
				String nameCruA = null;
				int sizeCru=3;
				Position positionCruA = new Position();
				cruiserA.buildShip(grid, cruiserA, SHIPS.CRUISER, sizeCru, nameCruA, positionCruA);
				
				Ship cruiserB= new Ship();
				String nameCruB = null;
				Position positionCruB = new Position();
				cruiserB.buildShip(grid, cruiserB, SHIPS.CRUISER, sizeCru, nameCruB, positionCruB);
				
				Ship submarineA = new Ship();
				String nameSubA = null;
				int sizeSub=3;
				Position positionSubA = new Position();
				submarineA.buildShip(grid, submarineA, SHIPS.SUBMARINE, sizeSub, nameSubA, positionSubA);
				
				Ship submarineB = new Ship();
				String nameSubB = null;
				Position positionSubB = new Position();
				submarineB.buildShip(grid, submarineB, SHIPS.SUBMARINE, sizeSub, nameSubB, positionSubB);
				
				Ship destroyerA= new Ship();
				String nameDesA = null;
				int sizeDes=2;
				Position positionDesA = new Position();
				destroyerA.buildShip(grid, destroyerA, SHIPS.DESTROYER, sizeDes, nameDesA, positionDesA);
				
				Ship destroyerB= new Ship();
				String nameDesB = null;
				Position positionDesB = new Position();
				destroyerB.buildShip(grid, destroyerB, SHIPS.DESTROYER, sizeDes, nameDesB, positionDesB);
				
				Ship destroyerC= new Ship();
				String nameDesC = null;
				Position positionDesC = new Position();
				destroyerC.buildShip(grid, destroyerC, SHIPS.DESTROYER, sizeDes, nameDesC, positionDesC);
				
				Ship destroyerD= new Ship();
				String nameDesD = null;
				Position positionDesD = new Position();
				destroyerD.buildShip(grid, destroyerD, SHIPS.DESTROYER, sizeDes, nameDesD, positionDesD);
				
				scan.close();
				
		//Generate strike
				
		//Impact		
			
	}

}
