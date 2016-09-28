package staff.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import staff.dao.DepartmentDAO;
import staff.mapper.DepartmentMapper;
import staff.model.Department;

@Service
@Transactional
public class DepartmentDAOImpl extends JdbcDaoSupport implements DepartmentDAO{
	@Autowired
	   public DepartmentDAOImpl(DataSource dataSource) {
	       this.setDataSource(dataSource);
	   }
	
	@Override
	   public List<Department> list() {
	       String sql = "Select * from company.department";
	       
	       Object[] params = new Object[] {};
	       DepartmentMapper mapper = new DepartmentMapper();
	 
	       List<Department> listDepartment = this.getJdbcTemplate().query(sql, params, mapper);
	       return listDepartment;
	   }
}
