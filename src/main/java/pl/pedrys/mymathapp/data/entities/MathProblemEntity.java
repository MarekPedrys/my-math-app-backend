package pl.pedrys.mymathapp.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import pl.pedrys.mymathapp.data.enums.MathProblemDepartment;
import pl.pedrys.mymathapp.data.enums.MathProblemLevel;
import pl.pedrys.mymathapp.data.enums.MathProblemYearOfStudy;

@Entity
public class MathProblemEntity {
	@Id
	@GeneratedValue
	private Long id;
	@Enumerated(EnumType.STRING)
	private MathProblemYearOfStudy yearOfStudy;
	@Enumerated(EnumType.STRING)
	private MathProblemLevel level;
	@Enumerated(EnumType.STRING)
	private MathProblemDepartment department;
	private Integer points;
	private String content;
	private String solution;
	private String info;
	private Boolean archived;

	public MathProblemEntity() {
	}

	public MathProblemEntity(MathProblemYearOfStudy yearOfStudy, MathProblemLevel level,
			MathProblemDepartment department, Integer points, String content, String solution, String info,
			Boolean archived) {
		this.yearOfStudy = yearOfStudy;
		this.level = level;
		this.department = department;
		this.points = points;
		this.content = content;
		this.solution = solution;
		this.info = info;
		this.archived = archived;
	}

	public Long getId() {
		return id;
	}

	public MathProblemYearOfStudy getYearOfStudy() {
		return yearOfStudy;
	}

	public MathProblemLevel getLevel() {
		return level;
	}

	public MathProblemDepartment getDepartment() {
		return department;
	}

	public Integer getPoints() {
		return points;
	}

	public String getContent() {
		return content;
	}

	public String getSolution() {
		return solution;
	}

	public String getInfo() {
		return info;
	}

	public Boolean getArchived() {
		return archived;
	}

}