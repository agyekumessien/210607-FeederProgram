package Game;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] allRooms;
	
	public void init() {
		Room br = new Room("You are heading to bathroom is a small room, where you can see a stairs");
		Room gr = new Room("You are heading to a small room, where you can see a garage");
		Room kit = new Room("You are heading to  a small room, where you can see a kichen");
		Room lr = new Room("You are heading to a small room1, where you can see a piano." +"where you can see a stairs");
		
		allRooms  = new Room[4];
		allRooms[3] = gr;
		allRooms[2] = br;
		allRooms[0] = kit;
		allRooms[1] = lr;
		
		
		
		br.setEastExit(br);
		gr.setWestExit(gr);
        lr.setRightExit(kit);
        kit.setRightExit(lr);

        startingRoom = lr;
      
      
	}

}
