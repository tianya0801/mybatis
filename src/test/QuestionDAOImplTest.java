package test;

import myExample.QuestionDAO;
import myExample.QuestionDAOImpl;

import org.junit.Before;
import org.junit.Test;

public class QuestionDAOImplTest {

	public QuestionDAO dao;
	@Before
	public void setUp() throws Exception {
		dao = new QuestionDAOImpl();
	}

	@Test
	public void queryByIdTest() {
		
		dao.queryById(56);
	}

}
