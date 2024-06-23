package pl.pedrys.mymathapp.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import pl.pedrys.mymathapp.data.entities.MathProblemEntity;

@Repository
public interface MathProblemRepository extends JpaRepository<MathProblemEntity, Long>, JpaSpecificationExecutor<MathProblemEntity>{
}