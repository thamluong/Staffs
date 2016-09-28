package staff.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import staff.model.Staff;
import org.springframework.jdbc.core.RowMapper;

public class StaffMapper implements RowMapper<Staff> {

	@Override
	public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {


		String name_department=rs.getString(1);

		int id_staff = rs.getInt(2);
		int  id_department = rs.getInt(3);
		String name_staff = rs.getString(4);
		String info_staff = rs.getString(5);
		String avatar_staff = rs.getString(6);
		String position_staff = rs.getString(7);
		String cert_staff = rs.getString(8);
		String info_cert = rs.getString(9);
		String multi_cert = rs.getString(10);		
		String salary_month = rs.getString(11);
		return new Staff(name_department, id_staff, id_department, name_staff, 
				info_staff, avatar_staff,position_staff,cert_staff, info_cert, multi_cert, salary_month);
	}

}