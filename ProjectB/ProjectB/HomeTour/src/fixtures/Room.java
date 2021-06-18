package fixtures;

public class Room {
	public String name;
	public Room[] exits = new Room[4];
	//left exit, right exit
	
	public Room(String name ) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Room [Foyer=" + name + "]";
	}
	
	
	
	public Room getRightExit() {
		return exits[1];
	}
	
	public Room getLeftExit() {
		return exits[0];
		
	}
	
	
	public Room getEastExit() {
		return exits[2];
	}
	
	
	public Room getWestExit() {
		return exits[3];
	}
	
	
	
	

	public void setEastExit(Room exit) {
		exits[2] = exit;
	}
	
	public void setWestExit(Room exit) {
		exits[3] = exit;
	}
	
	
	public void setRightExit(Room exit) {
			exits[1] = exit;
			
		}
		
	public void setLeftExit(Room exit) {
			exits[0] = exit;
		}
	
	
	
	
	}

