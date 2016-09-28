package staff.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import staff.model.Cert;
import org.springframework.jdbc.core.RowMapper;

public class CertMapper  implements RowMapper<Cert>{
	@Override
	   public Cert mapRow(ResultSet rs, int rowNum) throws SQLException {
	       int  id_cert = rs.getInt(1);
	       String cert_staff= rs.getString(2);
	       if(id_cert == 1) cert_staff="All";
	       String info_cert = rs.getString(3);
	       
	 
	       return new Cert(id_cert, cert_staff, info_cert);
	   }
}