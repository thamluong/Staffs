package staff.model;

public class Department {
	private int id_department;
	private String name_department;
	private String info_department;
	
	
	public Department(){
		
	}
	public Department(int id_department, String name_department, String info_department) {
		super();
		this.id_department = id_department;
		this.name_department = name_department;
		this.info_department = info_department;
	}
	public int getId_department() {
		return id_department;
	}
	public void setId_department(int id_department) {
		this.id_department = id_department;
	}
	public String getName_department() {
		return name_department;
	}
	public void setName_department(String name_department) {
		this.name_department = name_department;
	}
	public String getInfo_department() {
		return info_department;
	}
	public void setInfo_department(String info_department) {
		this.info_department = info_department;
	}
	
}
