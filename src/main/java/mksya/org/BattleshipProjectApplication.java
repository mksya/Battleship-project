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
				grid.generateGrid(columns,rows,field,spots);			
				
		//Generate ships
				
				Scanner scan = new Scanner(System.in);
				
				Ship carrier = new Ship();
				String nameCar = null;
				int sizeCar=5;
				

				System.out.println("Select axis");
				AXIS axisCar = AXIS.valueOf(scan.nextLine());
				System.out.println("Select direction");
				DIRECTION directionCar = DIRECTION.valueOf(scan.nextLine());
				System.out.println("Select origin x,y");
				int xOCar = scan.nextInt();
				int yOCar = scan.nextInt();
				ArrayList<Spot> positionCar= new ArrayList<Spot>();
				
				carrier.buildShip(grid, carrier, SHIPS.CARRIER, sizeCar, nameCar, axisCar, directionCar, xOCar, yOCar, positionCar);
				
				Ship submarine = new Ship();
				String nameSub = null;
				int sizeSub=3;
				

				System.out.println("Select axis");
				AXIS axisSub = AXIS.valueOf(scan.nextLine());
				System.out.println("Select direction");
				DIRECTION directionSub = DIRECTION.valueOf(scan.nextLine());
				System.out.println("Select origin x,y");
				int xOSub = scan.nextInt();
				int yOSub = scan.nextInt();
				ArrayList<Spot> positionSub= new ArrayList<Spot>();
				
				submarine.buildShip(grid, submarine, SHIPS.SUBMARINE, sizeSub, nameSub, axisSub, directionSub, xOSub, yOSub, positionSub);
				
				
				Fleet fleet = new Fleet();
				fleet.generateFleet(fleet, submarine, null, null, null, null, null, null, null, null, null, null);
				scan.close();
				
		//Generate strike
				
		//Impact		
			
	}

}
