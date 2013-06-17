package myExample.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class String_IntTypeHandler implements TypeHandler<String> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setParameter(PreparedStatement ps, int i, String parameter,
			JdbcType jdbcType) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResult(ResultSet rs, String columnName)
			throws SQLException {
		String str = null;
		str = (rs.getInt(columnName)==0)?"不可用":"可用";
		return str;
	}

	@Override
	public String getResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
