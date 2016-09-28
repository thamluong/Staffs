package staff.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import staff.model.ListStaffCert;

import org.springframework.jdbc.core.RowMapper;

public class ListStaffCertMapper  implements RowMapper<ListStaffCert>{
	@Override
	   public ListStaffCert mapRow(ResultSet rs, int rowNum) throws SQLException {
	       int  id_staff = rs.getInt(1);
	       String cert_staff = rs.getString(2);
	       String info_cert= rs.getString(3);
	       String multi_cert = rs.getString(4);
	       
	 
	       return new ListStaffCert(id_staff, cert_staff, info_cert, multi_cert);
	   }
}
