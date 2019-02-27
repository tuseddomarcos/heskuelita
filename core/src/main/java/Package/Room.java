package Package;

public class Room extends ContentID { 
	private int capacity;
	private int roomN;
	
	public Room(int id, int capacity, int roomN) {
		super(id);
		this.capacity = capacity;
		this.roomN = roomN;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getRoomN() {
		return roomN;
	}
}
