package Game;

import fixtures.Room;

public class Player {
	
	
	
	public static  Room[] rooms = null;
	private  Room startingRoom;

	public void init() {
	    Room foyer = new Room(
			"The Foyer" +
					"To the north is a small room1, where you can see a piano." +
					
	    		"The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor");
			Player.rooms[0] = foyer;
	        this.setStartingRoom(foyer);
	}

	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
}

