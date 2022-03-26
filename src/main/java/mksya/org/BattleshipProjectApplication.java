package mksya.org;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import business.GameImpl;
import model.Fleet;
import model.Spot;

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
				
			
				
		//Generate strike
				
		//Impact		
				scan.close();
	}

}
