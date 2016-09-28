package staff.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import staff.model.Position;
import org.springframework.jdbc.core.RowMapper;

public class PositionMapper  implements RowMapper<Position>{
	@Override
	   public Position mapRow(ResultSet rs, int rowNum) throws SQLException {
	       int  id_position = rs.getInt(1);
	       String name_position = rs.getString(2);     
	 
	       return new Position(id_position, name_position);
	   }
}
