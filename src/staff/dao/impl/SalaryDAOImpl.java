package staff.dao.impl;

import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import staff.dao.SalaryDAO;
import staff.mapper.SalaryMapper;
import staff.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SalaryDAOImpl extends JdbcDaoSupport implements SalaryDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	   public SalaryDAOImpl(DataSource dataSource) {
	       this.setDataSource(dataSource);
	}
	
	@Override
	public List<String> listMonth(){
		List<String> listMonths = Arrays.asList("January","February","March","April",
				"May","June","July","August","September","October","November","December");
		return listMonths;
	}
	
	@Override
	public List<Salary> list() {
		String sql="select * from company.salary";
		Object[] params = new Object[]{};
		SalaryMapper mapper = new SalaryMapper();
		return this.getJdbcTemplate().query(sql, params, mapper);
	}
}
