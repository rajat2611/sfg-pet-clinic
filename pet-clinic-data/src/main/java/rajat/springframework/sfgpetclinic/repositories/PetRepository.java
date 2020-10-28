package rajat.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rajat.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
