package staff.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import staff.dao.CertDAO;
import staff.mapper.CertMapper;
import staff.model.Cert;

@Service
@Transactional
public class CertDAOImpl extends JdbcDaoSupport implements CertDAO{
	@Autowired
	   public CertDAOImpl(DataSource dataSource) {
	       this.setDataSource(dataSource);
	   }
	
	@Override
	   public List<Cert> list() {
	       String sql = "Select * from company.cert where id_cert <> 0";
	       
	       Object[] params = new Object[] {};
	       CertMapper mapper = new CertMapper();
	 
	       List<Cert> listCert = this.getJdbcTemplate().query(sql, params, mapper);
	       return listCert;
	   }
}
