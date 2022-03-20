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
		Scanner scan = new Scanner(System.in);
		
		//Generate grid
				Grid grid = new Grid();
				int columns=10;
				int rows=10;
				int field[][]= new int[columns][rows];
				ArrayList<Spot> spots = new ArrayList<Spot>();
				grid.generateGrid(columns,rows,field,spots);			
				
		//Generate ships
				
				
				Ship submarine = new Ship();
				String nameSub = null;
				int sizeSub=3;
				
				ArrayList<Spot> spotsSubmarine = new ArrayList<Spot>();
				System.out.println("Select axis");
				AXIS axis = AXIS.valueOf(scan.nextLine());
				System.out.println("Select direction");
				DIRECTION direction = DIRECTION.valueOf(scan.nextLine());
				System.out.println("Select origin x,y");
				int xOSub = scan.nextInt();
				int yOSub = scan.nextInt();
				
				if(grid.checkPositionAvailable(grid, submarine)==false) {
					System.out.println("Position not available");
					submarine.selectPosition();
				
				}else{
					submarine.buildShip(grid,submarine, SHIPS.SUBMARINE, sizeSub, nameSub, axis, direction, xOSub, yOSub, spotsSubmarine);
				}
				
		//Generate strike
				
		//Impact		
			
				

				scan.close();
	}

}
