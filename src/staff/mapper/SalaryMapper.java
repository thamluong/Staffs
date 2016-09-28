package staff.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import staff.model.Salary;
import org.springframework.jdbc.core.RowMapper;

public class SalaryMapper implements RowMapper<Salary> {

	@Override
	public Salary mapRow(ResultSet rs, int rowNum) throws SQLException {

		int id_staff=rs.getInt(1);
		String salary_month1 = rs.getString(2);
		String salary_month2= rs.getString(3);
		String salary_month3 = rs.getString(4);
		String salary_month4= rs.getString(5);
		String salary_month5= rs.getString(6);
		String salary_month6= rs.getString(7);
		String salary_month7= rs.getString(8);
		String salary_month8= rs.getString(9);
		String salary_month9= rs.getString(10);
		String salary_month10= rs.getString(11);
		String salary_month11= rs.getString(12);
		String salary_month12= rs.getString(13);

		return new Salary(id_staff,salary_month1, salary_month2, salary_month3, salary_month4,
				salary_month5, salary_month6, salary_month7, salary_month8,
				salary_month9, salary_month10, salary_month11, salary_month12);

	}
}