package myExample;

import myExample.domain.Question;

public interface QuestionDAO {
	
	public Question queryById(int sid);
}
