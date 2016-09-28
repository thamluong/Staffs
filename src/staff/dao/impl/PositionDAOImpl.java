package staff.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import staff.dao.PositionDAO;
import staff.mapper.PositionMapper;
import staff.model.Position;

@Service
@Transactional
public class PositionDAOImpl extends JdbcDaoSupport implements PositionDAO{
	@Autowired
	   public PositionDAOImpl(DataSource dataSource) {
	       this.setDataSource(dataSource);
	   }
	
	@Override
	   public List<Position> list() {
	       String sql = "Select * from company.position group by position_staff";
	       
	       Object[] params = new Object[] {};
	       PositionMapper mapper = new PositionMapper();
	 
	       List<Position> listPosition = this.getJdbcTemplate().query(sql, params, mapper);
	       return listPosition;
	   }
}

