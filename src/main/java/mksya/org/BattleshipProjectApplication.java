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
				grid.generateGrid(columns,rows,field,spots);			
				
		//Generate ships
				Scanner scan = new Scanner(System.in);
				Ship submarine = new Ship();
				String nameSub = null;
				int sizeSub=3;
				Position positionSub = new Position();
				
				submarine.buildShip(grid, submarine, SHIPS.SUBMARINE, sizeSub, nameSub, positionSub);
				

				Ship carrier = new Ship();
				String nameCar = null;
				int sizeCar=3;
				
				
				
				System.out.println("Tapez z");
				int z= 22222;
				Scanner scan2 = new Scanner(System.in);
				while(scan2.hasNextInt()) {
				System.out.println(scan2.nextInt());
				scan2.close();
				}
		//Generate strike
				
		//Impact		
			
	}

}
