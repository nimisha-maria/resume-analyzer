package resumeanalyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import resumeanalyzer.entity.Analysis;

public interface AnalysisRepository extends JpaRepository<Analysis, Long> {

}
