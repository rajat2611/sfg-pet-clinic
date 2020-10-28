package rajat.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rajat.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
