package staff.dao.impl;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import staff.dao.ListStaffCertDAO;
import staff.dao.StaffDAO;
import staff.mapper.StaffMapper;
import staff.model.ListStaffCert;
import staff.model.Staff;

@Service
@Transactional
public class StaffDAOImpl extends JdbcDaoSupport implements StaffDAO{

	@Autowired
	public StaffDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	@Autowired
	private ListStaffCertDAO listcertDAO;

	@Override
	public List<Staff> list() {
		//updateDataMulticert ();
		String sql = "SELECT department.name_department,staff.*,position.position_staff, cert.cert_staff,cert.info_cert,multi_cert,salary.January"
				+ " FROM company.department INNER JOIN (company.staff"
				+ " inner join company.position using(id_staff)"
				+ " inner join (company.list_staff_cert inner join company.cert using(id_cert)) using(id_staff)"
				+ " inner join company.salary using(id_staff))"
				+ " USING(id_department)";

		StaffMapper mapper = new StaffMapper();	 
		List<Staff> list = this.getJdbcTemplate().query(sql, mapper);

		List<ListStaffCert> list_cert = listcertDAO.list();
		int i = -1;
		int n = list.size();
		Staff temp;
		ListStaffCert tempcert;

		while(++i < n){
			temp = list.get(i);
			if(temp.getMulti_cert() != null){
				int j = -1, m = list_cert.size();
				while(++j < m){
					tempcert = list_cert.get(j);
					if(temp.getMulti_cert().contains(tempcert.getCert_staff())){ 
						temp.setCert_staff(temp.getMulti_cert());
						temp.setInfo_cert(tempcert.getInfo_cert());
					}
				}
			}
		}
		return list;
	}

	@Override
	public List<Staff> listObject( String id1, String id2, String id3, String id4){

		String id2_2 = id2;
		String id3_2 = id3;
		
		if(id2.equals("")) ;
		else if (id2.equals("Directors")){
			id2 = "Director";
			id2_2 = "CEO";
		}
		else if(id2.equals("Leaders and Managers")){
			id2 = "leader";
			id2_2 = "manager";
		}
		else id2 = "staff";
		
		if(id3.equals("Any certificate")) id3_2 = "";

		String sql = "SELECT department.name_department,staff.*,position.position_staff, cert.cert_staff,cert.info_cert, multi_cert, salary."
				+ id4
				+ " FROM company.department INNER JOIN (company.staff"
				+ " INNER JOIN company.position USING(id_staff)"
				+ " INNER JOIN (company.list_staff_cert INNER JOIN company.cert USING(id_cert)) USING(id_staff)"
				+ " INNER JOIN company.salary USING(id_staff))"
				+ " USING(id_department)"
				+ " WHERE (id_department = '"+id1+"' or '"+id1+"'= '') and (position_staff like '%"+id2+"%' or position_staff like '%"+id2_2+"%' or '"+id2+"' = '') and (cert_staff like '%"+id3+"%' or cert_staff like '%"+id3_2+"%' or '"+id3+"' = '')";
		
		StaffMapper mapper = new StaffMapper();
		List<Staff> list = this.getJdbcTemplate().query(sql, mapper);

		List<ListStaffCert> list_cert = listcertDAO.list();
		int i = -1;
		int n = list.size();
		Staff temp;
		ListStaffCert tempcert;

		while(++i < n){
			temp = list.get(i);
			if(temp.getMulti_cert() != null){
				int j = -1, m = list_cert.size();
				while(++j < m){
					tempcert = list_cert.get(j);
					if(temp.getMulti_cert().contains(tempcert.getCert_staff())){ 
						temp.setCert_staff(temp.getMulti_cert());
						temp.setInfo_cert(tempcert.getInfo_cert());
					}
				}
			}
		}

		return list;
	}


	@Override
	public Staff detail(String id){
		String sql="SELECT department.name_department,staff.*,position.position_staff, cert.cert_staff, cert.info_cert, multi_cert, salary.January"
				+ " FROM company.department INNER JOIN (company.staff"
				+ " inner join company.position using(id_staff)"
				+ " inner join (company.list_staff_cert inner join company.cert using(id_cert)) using(id_staff)"
				+ " inner join company.salary using(id_staff))"
				+ " USING(id_department)"
				+ " where staff.id_staff=" + id;
		Object[] params = new Object[]{};
		StaffMapper mapper = new StaffMapper();
		return this.getJdbcTemplate().queryForObject(sql, params, mapper);
	}

}
