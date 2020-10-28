package rajat.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rajat.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
