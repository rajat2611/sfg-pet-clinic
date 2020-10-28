package rajat.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rajat.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
