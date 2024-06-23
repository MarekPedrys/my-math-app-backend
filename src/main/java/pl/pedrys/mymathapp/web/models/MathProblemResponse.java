package pl.pedrys.mymathapp.web.models;

import pl.pedrys.mymathapp.data.entities.MathProblemEntity;
import pl.pedrys.mymathapp.data.enums.MathProblemDepartment;
import pl.pedrys.mymathapp.data.enums.MathProblemLevel;
import pl.pedrys.mymathapp.data.enums.MathProblemYearOfStudy;

public record MathProblemResponse(Long id,
                                  MathProblemYearOfStudy yearOfStudy,
                                  MathProblemLevel level,
                                  MathProblemDepartment department,
                                  Integer points,
                                  String content,
                                  String solution,
                                  String info,
                                  Boolean archived) {

    public MathProblemResponse(MathProblemEntity entity) {
        this(entity.getId(), entity.getYearOfStudy(), entity.getLevel(), entity.getDepartment(), entity.getPoints(), entity.getContent(), entity.getSolution(), entity.getInfo(), entity.getArchived());
    }

}