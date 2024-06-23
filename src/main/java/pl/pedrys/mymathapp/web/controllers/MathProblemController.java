package pl.pedrys.mymathapp.web.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.pedrys.mymathapp.data.entities.MathProblemEntity;
import pl.pedrys.mymathapp.data.enums.MathProblemDepartment;
import pl.pedrys.mymathapp.data.enums.MathProblemLevel;
import pl.pedrys.mymathapp.data.enums.MathProblemYearOfStudy;
import pl.pedrys.mymathapp.services.MathProblemService;
import pl.pedrys.mymathapp.web.models.MathProblemResponse;

import java.util.List;

@RestController
@RequestMapping("math-problems")
public class MathProblemController {

    private final MathProblemService mathProblemService;

    public MathProblemController(MathProblemService mathProblemService) {
        this.mathProblemService = mathProblemService;
    }

    @GetMapping
    public ResponseEntity<List<MathProblemResponse>> listByFilters(@RequestParam(required = false) Long id,
                                                                   @RequestParam(required = false) MathProblemYearOfStudy yearOfStudy,
                                                                   @RequestParam(required = false) MathProblemLevel level,
                                                                   @RequestParam(required = false) MathProblemDepartment department,
                                                                   @RequestParam(required = false) Integer points,
                                                                   @RequestParam(required = false) String info,
                                                                   @RequestParam(required = false) Boolean skipArchived,
                                                                   @RequestParam(required = false) Boolean onlyWithoutContent,
                                                                   @RequestParam(required = false) Boolean onlyWithoutSolution,
                                                                   @RequestParam(required = false, defaultValue = "0") Integer pageNumber,
                                                                   @RequestParam(required = false, defaultValue = "4") Integer pageSize) {
        return ResponseEntity.ok(mathProblemService.listByFilters(id, yearOfStudy, level, department, points, info, skipArchived, onlyWithoutContent, onlyWithoutSolution, pageNumber, pageSize));
    }

}