package myExample.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class StringTypeHandler extends BaseTypeHandler<String> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i,
			String parameter, JdbcType jdbcType) throws SQLException {
		//ps.setString(i, parameter);
	}

	@Override
	public String getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		Date d = rs.getTimestamp(columnName);
		String r=null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		
		if(d != null)
			r= sdf.format(d);
		return r;
	}

	@Override
	public String getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		return null;// rs.getString(columnIndex)==null?"unknown":rs.getString(columnIndex);
	}

	@Override
	public String getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		return null;//cs.getString(columnIndex)==null?"unknown":cs.getString(columnIndex);
	}

}
