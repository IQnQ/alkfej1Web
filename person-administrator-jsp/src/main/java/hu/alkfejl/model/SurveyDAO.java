package hu.alkfejl.model;



import hu.alkfejl.model.bean.Survey;

import java.util.List;

public interface SurveyDAO {

    List<Survey> listSurveys();
    Survey getSurvey(int id);
}
