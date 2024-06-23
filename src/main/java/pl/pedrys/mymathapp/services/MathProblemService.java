package pl.pedrys.mymathapp.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import pl.pedrys.mymathapp.data.entities.MathProblemEntity;
import pl.pedrys.mymathapp.data.enums.MathProblemDepartment;
import pl.pedrys.mymathapp.data.enums.MathProblemLevel;
import pl.pedrys.mymathapp.data.enums.MathProblemYearOfStudy;
import pl.pedrys.mymathapp.data.repositories.MathProblemRepository;
import pl.pedrys.mymathapp.data.specifications.MathProblemSpecification;
import pl.pedrys.mymathapp.web.models.MathProblemResponse;

import java.util.List;

@Service
public class MathProblemService {

    private final MathProblemRepository mathProblemRepository;

    public MathProblemService(MathProblemRepository mathProblemRepository) {
        this.mathProblemRepository = mathProblemRepository;
    }

    public List<MathProblemResponse> listByFilters(Long id,
                                                   MathProblemYearOfStudy yearOfStudy,
                                                   MathProblemLevel level,
                                                   MathProblemDepartment department,
                                                   Integer points,
                                                   String info,
                                                   Boolean skipArchived,
                                                   Boolean onlyWithoutContent,
                                                   Boolean onlyWithoutSolution,
                                                   Integer pageNumber,
                                                   Integer pageSize
    ) {
        Specification<MathProblemEntity> specification = MathProblemSpecification.of(id, yearOfStudy, level, department,
                points, info, skipArchived, onlyWithoutContent, onlyWithoutSolution);
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by(Sort.Direction.DESC, "id"));
        Page<MathProblemEntity> pageOfEntities = mathProblemRepository.findAll(specification, pageRequest);
        List<MathProblemResponse> listOfMathProblemResponses = pageOfEntities.getContent().stream()
                .map(MathProblemResponse::new)
                .toList();
        return listOfMathProblemResponses;
    }
}