package repositories;

import models.DocumentReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentReportRepository extends JpaRepository<DocumentReport, Long> {
}
