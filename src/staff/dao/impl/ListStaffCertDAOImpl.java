package staff.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import staff.dao.ListStaffCertDAO;
import staff.mapper.ListStaffCertMapper;
import staff.model.ListStaffCert;

@Service
@Transactional
public class ListStaffCertDAOImpl extends JdbcDaoSupport implements ListStaffCertDAO{
	@Autowired
	   public ListStaffCertDAOImpl(DataSource dataSource) {
	       this.setDataSource(dataSource);
	   }
	
	@Override
	   public List<ListStaffCert> list() {
	       String sql = "SELECT id_staff,cert_staff,info_cert,multi_cert"
	       		+ " FROM company.list_staff_cert inner join company.cert using(id_cert)"
	    		+ " where cert_staff like '%%' group by cert_staff";
	       
	       ListStaffCertMapper mapper = new ListStaffCertMapper();
	 
	       List<ListStaffCert> listCert = this.getJdbcTemplate().query(sql, mapper);
	       return listCert;
	   }
}
