package pl.pedrys.mymathapp.data.specifications;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Predicate;
import pl.pedrys.mymathapp.data.entities.MathProblemEntity;
import pl.pedrys.mymathapp.data.enums.MathProblemDepartment;
import pl.pedrys.mymathapp.data.enums.MathProblemLevel;
import pl.pedrys.mymathapp.data.enums.MathProblemYearOfStudy;

public class MathProblemSpecification {

	private MathProblemSpecification() {
	    }

	public static Specification<MathProblemEntity> of(Long id, MathProblemYearOfStudy yearOfStudy, MathProblemLevel level,
			MathProblemDepartment department, Integer points, String info, Boolean skipArchived,
			Boolean onlyWithoutContent, Boolean onlyWithoutSolution) {
		return (root, query, builder) -> {
			List<Predicate> predicateList = new ArrayList<>();

			if (id != null) {
				predicateList.add(builder.equal(root.get("id"), id));
			}

			if (yearOfStudy != null) {
				predicateList.add(builder.equal(root.get("yearOfStudy"), yearOfStudy));
			}

			if (level != null) {
				predicateList.add(builder.equal(root.get("level"), level));
			}

			if (department != null) {
				predicateList.add(builder.equal(root.get("department"), department));
			}

			if (points != null) {
				predicateList.add(builder.equal(root.get("points"), (points)));
			}

			if (info != null) {
				predicateList.add(builder.like(root.get("info"), "%" + info + "%"));
			}

			if (Boolean.TRUE.equals(skipArchived)) {
				predicateList.add(builder.equal(root.get("archived"), false));
			}

			if (Boolean.TRUE.equals(onlyWithoutContent)) {
				predicateList.add(builder.equal(root.get("content"), "") // TODO
				);
			}

			if (Boolean.TRUE.equals(onlyWithoutSolution)) {
				predicateList.add(builder.equal(root.get("solution"), "") // TODO
				);
			}

			return builder.and(predicateList.toArray(new Predicate[] {}));
		};
	}

}
