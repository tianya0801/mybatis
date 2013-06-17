package myExample.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class DateTypeHandler extends BaseTypeHandler<Date> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i,
			Date parameter, JdbcType jdbcType) throws SQLException {
	}

	@Override
	public Date getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		java.sql.Timestamp timestamp = rs.getTimestamp(columnName);
		Date d = null;
		if (timestamp != null)
			d = new Date(timestamp.getTime());
		
		return d;
	}

	@Override
	public Date getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		return null;
	}

	@Override
	public Date getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		return null;
	}

}
