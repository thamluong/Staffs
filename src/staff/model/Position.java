package staff.model;

public class Position {
	private int id_staff;
	private String position_staff;
	
	
	public Position(int id_staff, String position_staff) {
		super();
		this.id_staff = id_staff;
		this.position_staff = position_staff;
	}
	public int getId_staff() {
		return id_staff;
	}
	public void setId_staff(int id_staff) {
		this.id_staff = id_staff;
	}
	public String getPosition_staff() {
		return position_staff;
	}
	public void setPosition_staff(String position_staff) {
		this.position_staff = position_staff;
	}
	
}
