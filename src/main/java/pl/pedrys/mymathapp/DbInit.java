package pl.pedrys.mymathapp;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import pl.pedrys.mymathapp.data.entities.MathProblemEntity;
import pl.pedrys.mymathapp.data.enums.MathProblemDepartment;
import pl.pedrys.mymathapp.data.enums.MathProblemLevel;
import pl.pedrys.mymathapp.data.enums.MathProblemYearOfStudy;
import pl.pedrys.mymathapp.data.repositories.MathProblemRepository;

@Component
public class DbInit {

	private final MathProblemRepository mathProblemRepository;

	public DbInit(MathProblemRepository mathProblemRepository) {
		this.mathProblemRepository = mathProblemRepository;
	}

    @EventListener(ApplicationReadyEvent.class)
    public void initDb() {

        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_1, MathProblemLevel.BASIC, MathProblemDepartment.FUNKCJE, 3, "tresc zadania...", "rozwiazanie...", "info...", false));
        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_2, MathProblemLevel.BASIC, MathProblemDepartment.PLANIMETRIA, 3, "tresc zadania...", "rozwiazanie...", "info...", true));
        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_3, MathProblemLevel.ADVANCED, MathProblemDepartment.CIAGI, 3, "tresc zadania...", "rozwiazanie...", "info...", false));
        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_3, MathProblemLevel.ADVANCED, MathProblemDepartment.GEOMETRIA_ANALITYCZNA, 3, "tresc zadania...", "rozwiazanie...", "info...", false));
        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_4, MathProblemLevel.ADVANCED, MathProblemDepartment.LICZBY_RZECZYWISTE, 3, "tresc zadania...", "rozwiazanie...", "info...", false));
        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_3, MathProblemLevel.ADVANCED, MathProblemDepartment.FUNKCJE, 3, "tresc zadania...", "rozwiazanie...", "info...", false));
        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_3, MathProblemLevel.BASIC, MathProblemDepartment.FUNKCJE, 3, "tresc zadania...", "rozwiazanie...", "info...", false));
        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_3, MathProblemLevel.ADVANCED, MathProblemDepartment.FUNKCJE, 3, "tresc zadania...", "rozwiazanie...", "info...", false));
        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_4, MathProblemLevel.BASIC, MathProblemDepartment.PRAWDOPODOBIENSTWO, 2, "tresc zadania...", "rozwiazanie...", "info...", false));
        mathProblemRepository.save(new MathProblemEntity(MathProblemYearOfStudy.SECONDARY_SCHOOL_4, MathProblemLevel.ADVANCED, MathProblemDepartment.PRAWDOPODOBIENSTWO, 5, "tresc zadania...", "rozwiazanie...", "info...", false));

    }
	
}