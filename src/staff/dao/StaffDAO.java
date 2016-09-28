package staff.dao;

import java.util.List;

import staff.model.Staff;

public interface StaffDAO {
	
	public List<Staff> list();
	public List<Staff> listObject(String id, String id2, String id3, String id4);	
	public Staff detail(String id);
}
