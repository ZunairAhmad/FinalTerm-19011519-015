package repositories;

public interface DoctorRepository {
	import models.Doctor;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	    Doctor findByDepartment(String department);
	}
}
