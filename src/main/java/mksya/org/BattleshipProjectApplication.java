package mksya.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import business.GameImpl;
import entities.Carrier;
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
		
		GameImpl game= new GameImpl();
		
				Spot[][] field = null;
				game.generateField(field);	
				
				Fleet fleet = new Fleet();
				game.generateFleet(fleet);
				
				Scanner scan = new Scanner(System.in);
				game.deployFleet(field, fleet);
				
				scan.close();
				
		//Generate strike
				
		//Impact		
			
	}

}
