package repositories;

public interface DiseaseRemarksRepository {
	import com.models.DiseaseRemarksRepository;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface DiseaseRemarksRepository extends JpaRepository<Disease, Long> {

	    Disease findByDisease(String disease);
	}

}
