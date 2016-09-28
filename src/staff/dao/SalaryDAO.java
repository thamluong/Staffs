package staff.dao;

import java.util.List;

import staff.model.Salary;

public interface SalaryDAO {
	
	public List<String> listMonth();
	public List<Salary> list();
}

