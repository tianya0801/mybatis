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


public class Test {

	public static Log log = LogFactory.getLog(Test.class);
	public static void main(String[] args) {
/*		 SqlSessionFactory factory = null;  
	        try {  
	            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("Configuration.xml"));  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	        SqlSession sqlSession = factory.openSession();  
	        Person p = (Person) sqlSession.selectOne("com.qiuqiu.dao.PersonDao.selectUserById", 5);  
	        System.out.println(p.getName());  
	    }  */

			InputStream inputStream = null;
			try {
				inputStream = Resources.getResourceAsStream("test/datasource.xml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		QuestionDAO dao = session.getMapper(QuestionDAO.class);
		Question q = dao.queryById(65);
		
		log.debug(q);
		
	}

}
