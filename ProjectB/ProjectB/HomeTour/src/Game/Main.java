package Game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	private  static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		RoomManager rm = new RoomManager();
		rm.init();
		
		Room currentRoom = rm.startingRoom;
		boolean quit = false;
		while(!quit) {
			System.out.println(currentRoom);
			System.out.println("Which direction do you want to go? Left or Right, East or West?"
					+ "\nOr do you want to quit?");
					
					String input = scan.next();
			
					if (input.trim().toLowerCase().equals("quit")) {
						quit = true;
						continue;
					}
						
						Room nextRoom = null;
					
						if (input.equals("left")) {
							nextRoom = currentRoom.getLeftExit();

							}else if (input.equals("right")) {
								nextRoom = currentRoom.getRightExit();
							}else if (input.equals("east")) { 
								nextRoom = currentRoom.getEastExit();
							}else if (input.equals("west")) { 
								nextRoom = currentRoom.getWestExit();
							}
		if (nextRoom != null) {
			currentRoom = nextRoom;
				
			}
		}
		
	}
}

