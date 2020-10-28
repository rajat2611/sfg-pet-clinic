package rajat.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rajat.springframework.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality,Long> {
}
