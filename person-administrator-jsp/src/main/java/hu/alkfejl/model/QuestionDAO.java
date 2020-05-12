package hu.alkfejl.model;

import hu.alkfejl.model.bean.Question;

import java.util.List;

public interface QuestionDAO {

    List<Question> listQuestions(int surveyID);
}
