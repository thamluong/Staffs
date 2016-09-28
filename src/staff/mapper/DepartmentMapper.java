package staff.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import staff.model.Department;
import org.springframework.jdbc.core.RowMapper;

public class DepartmentMapper  implements RowMapper<Department>{
	@Override
	   public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
	       int  id_department = rs.getInt(1);
	       String name_department = rs.getString(2);
	       String info_department = rs.getString(3);
	 
	       return new Department(id_department, name_department, info_department);
	   }
}

