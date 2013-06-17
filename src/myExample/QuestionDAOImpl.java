package myExample;

import java.io.IOException;
import java.io.InputStream;

import myExample.domain.Question;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class QuestionDAOImpl implements QuestionDAO {
	private static Log log = LogFactory.getLog(Test.class);
	private static SqlSessionFactory factory;

	static {

		InputStream inputStream = null;
		try {
			inputStream = Resources
					.getResourceAsStream("myExample/datasource.xml");
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Question queryById(int sid) {

		SqlSession session = null;
		Question q = null;
		try {
			session = factory.openSession();
			/*QuestionDAO dao = session.getMapper(QuestionDAO.class);
			q = dao.queryById(sid);*/
			
			q = (Question)session.selectOne("myExample.QuestionDAO.queryById", 56);
			
		} finally {
			session.close();
		}

		log.debug(q);
		return q;
	}

}
